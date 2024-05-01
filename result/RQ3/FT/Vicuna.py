import sys
import os
sys.path.append(os.getcwd()) 
from typing import List
os.environ["CUDA_VISIBLE_DEVICES"] = "0,1"
import torch
import torch.nn as nn
import bitsandbytes as bnb
import transformers
from datasets import load_dataset
from transformers import AutoModelForCausalLM, AutoConfig
from peft import LoraConfig, get_peft_model 
from peft import PeftModel
from transformers import AutoTokenizer
from tqdm import tqdm
from peft import (
    LoraConfig,
    get_peft_model,
    get_peft_model_state_dict,
    prepare_model_for_int8_training,
    set_peft_model_state_dict,
)
os.environ["TOKENIZERS_PARALLELISM"] = "false"  # Turn off parallelization token to avoid deadlocks
from utils.prompter import Prompter

output_dir: str = "./lora-checkpoint/DLAP-Android"  # Lora saving path
cutoff_len: int = 512  # Truncation length, cut off tokens that exceed this length
# Using Apache to build instruction fine-tuning template generation classes
prompt_template_name: str = "alpaca"
prompter = Prompter(prompt_template_name)
train_on_inputs: bool = True  # Incorporate model input into training
add_eos_token: bool = False  # Add a terminator to enhance the model's ability to stop output
group_by_length: bool = False  # Package data according to Token length

class Vicuna_Lora():
    def __init__(self, model_name="Vicuna-13B") -> None: 
        self.base_model =  "/nvme2n1/PTMs/bigscience/" + model_name
    def prepared(self):
        self.model = AutoModelForCausalLM.from_pretrained(
                self.base_model,
                torch_dtype=torch.bfloat16,  
                device_map="auto",
            )  
        AutoConfig.from_pretrained(self.base_model)
        print("*"*40+"model load succ..."+"*"*40)

        # Freeze original model parameters
        list(self.model.parameters())[0].dtype
        for i, param in enumerate(self.model.parameters()):
            # freeze the model - train adapters later
            param.requires_grad = False  
            if param.ndim == 1:
                param.data = param.data.to(torch.float32)
        self.model.gradient_checkpointing_enable()  
        self.model.enable_input_require_grads()
        class CastOutputToFloat(nn.Sequential):
            def forward(self, x): 
                return super().forward(x).to(torch.float32)
        self.model.lm_head = CastOutputToFloat(self.model.lm_head)


        lora_r = 8 # Lora matrix width
        lora_alpha=16 # value of Lora's original training alpha
        lora_target_modules = ["q_proj", "v_proj"] # Attention Model Matrix of Lora Effect
        lora_dropout=0.01  # Dropout
        config = LoraConfig(  # Lora configurations
                r=lora_r,
                lora_alpha=lora_alpha,
                target_modules=lora_target_modules, 
                lora_dropout=lora_dropout,
                bias="none",
                task_type="CAUSAL_LM",
            )
        # Combine the Lora model with the original model
        print("*"*40+"lora load succ..."+"*"*40)
        self.model = get_peft_model(self.model, config)  

        self.print_trainable_parameters()
        print(self.model)

        print("*"*40+"tokenzing"+"*"*40)
        with tqdm(total=1, unit="models", desc="Loading tokenizer") as pbar:
            self.tokenizer = AutoTokenizer.from_pretrained(self.base_model)  # build tokenizer
            pbar.update(1)
        print("*"*40+"finishing tokenzing"+"*"*40)

        self.model.get_input_embeddings()
        self.tokenizer.pad_token_id = (
            0 
        )
        print("*"*40+"tokenizer load succ..."+"*"*40)


    def print_trainable_parameters(self):
        """
        Prints the number of trainable parameters in the model.
        """
        trainable_params = 0
        all_param = 0
        for _, param in self.model.named_parameters():
            all_param += param.numel()
            if param.requires_grad:
                trainable_params += param.numel()
        print(
            f"trainable params: {trainable_params} || all params: {all_param} || trainable%: {100 * trainable_params / all_param}"
        )



    def tokenize(self, prompt, add_eos_token=True):
        result = self.tokenizer(
            prompt,
            # Truncate data exceeding max_length
            truncation=True,  
            max_length=cutoff_len,
            # No padding, use data_collator for padding during training
            padding=False,  
            return_tensors=None,
        )
        if (
                result["input_ids"][-1] != self.tokenizer.eos_token_id
                and len(result["input_ids"]) < cutoff_len
                and add_eos_token
        ):
            result["input_ids"].append(self.tokenizer.eos_token_id)
            result["attention_mask"].append(1)
        # The labels of the decoding model are consistent with the output
        result["labels"] = result["input_ids"].copy()  
        return result

    # process the dataset
    def generate_and_tokenize_prompt(self, data_point):
        full_prompt = prompter.generate_prompt(
            data_point["instruction"],
            data_point["input"],
            data_point["output"],
        )  # build data with instruction templates
        tokenized_full_prompt = self.tokenize(full_prompt)
        if not train_on_inputs:
            user_prompt = prompter.generate_prompt(
                data_point["instruction"], data_point["input"]
            )
            tokenized_user_prompt = self.tokenize(
                user_prompt, add_eos_token=add_eos_token
            )
            user_prompt_len = len(tokenized_user_prompt["input_ids"])

            if add_eos_token:
                user_prompt_len -= 1
            # Set the label that do not participate in training to negative, and pytorch does not calculate the loss of negative numbers
            tokenized_full_prompt["labels"] = [-100] * user_prompt_len + tokenized_full_prompt["labels"][user_prompt_len:]
        return tokenized_full_prompt    

    def load_data(self, train_path, test_path):
        data_fields = {"train": train_path, "test": test_path}
        self.val_set_size = 300
        data = load_dataset("json", data_files=data_fields)

        if self.val_set_size > 0:  # Split testing set
            train_val = data["train"].train_test_split(
                test_size=self.val_set_size, shuffle=True, seed=42
            )
            self.train_data = (
                train_val["train"].shuffle().map(self.generate_and_tokenize_prompt)
            )
            self.val_data = (
                train_val["test"].shuffle().map(self.generate_and_tokenize_prompt)
            )
        else:
            self.train_data = data["train"].shuffle().map(self.generate_and_tokenize_prompt)
            self.val_data = None
        print("*"*40+"datastructing succ..."+"*"*40)        

    # train the model by LoRA
    def train(self):
        micro_batch_size: int = 4  # batch size calculated each time
        num_epochs: int = 5 # number of training epochs
        learning_rate: float = 3e-4 # learning rate
        batch_size = 128
        # Calculate the cumulative number of gradients
        gradient_accumulation_steps = batch_size // micro_batch_size 
        print("*"*40+"start training..."+"*"*40)
        trainer = transformers.Trainer(
            model=self.model,
            train_dataset=self.train_data,
            eval_dataset=self.val_data,
            args=transformers.TrainingArguments(
                per_device_train_batch_size=micro_batch_size,
                gradient_accumulation_steps=gradient_accumulation_steps,
                warmup_steps=100,  
                num_train_epochs=num_epochs,
                learning_rate=learning_rate,
                bf16=True,  
                logging_steps=10,  # interval between printing a loss
                optim="adamw_torch",
                evaluation_strategy="steps" if self.val_set_size > 0 else "no",
                save_strategy="steps",
                eval_steps=5 if self.val_set_size > 0 else None,  # 每多少步进行一次验证
                save_steps=50,  # interval between saving a checkpoint
                output_dir=output_dir,
                save_total_limit=5,  # maximum number of checkpoints to store
                load_best_model_at_end=True if self.val_set_size > 0 else False,
                group_by_length=group_by_length,
            ),
            data_collator=transformers.DataCollatorForSeq2Seq(  # dynamic padding
                self.tokenizer, pad_to_multiple_of=8, return_tensors="pt", padding=True
            ),
        )
        self.model.config.use_cache = False
        print("*"*40+"starting training..."+"*"*40)
        trainer.train()
        print("*"*40+"finishing training..."+"*"*40)

    @torch.inference_mode()
    def evaluate(
        self,
        model,
        instruction,
        input=None,
        top_p=0.75,
        top_k=40,
        num_beams=4,
        max_new_tokens=256,
        **kwargs,
    ):
        prompt = prompter.generate_prompt(instruction, input)
        inputs = self.tokenizer(prompt, return_tensors="pt", truncation=True, max_length=2048, padding= True)
        input_ids = inputs["input_ids"].to(self.device)

        # Without streaming
        with torch.no_grad():
            generation_output = model.generate(
                input_ids=input_ids,
                top_p=top_p, 
                top_k=top_k, 
                num_beams=num_beams,
                return_dict_in_generate=True,
                output_scores=True,
                max_new_tokens=max_new_tokens,
            )
        s = generation_output.sequences[0]
        # Convert the inferred ids to a string
        output = self.tokenizer.decode(s)  
        try:
            # only output newly generated results
            return prompter.get_response(output)  
        except Exception as e:
            return e

    # test the model
    def test(self, 
             lora_weights,
             train_path, 
             test_path,
             output_dir
             ):
        if torch.cuda.is_available():
            self.device = "cuda"
        else:
            self.device = "cpu"

        # The template is included in the templates folder
        prompt_template= "alpaca"  
        
        self.prompter = Prompter(prompt_template)
        self.tokenizer = AutoTokenizer.from_pretrained(self.base_model)
        
        if self.device == "cuda":
            self.model = AutoModelForCausalLM.from_pretrained(
                self.base_model,
                torch_dtype=torch.bfloat16,
                device_map="auto",
            )
            self.lora_model = PeftModel.from_pretrained(
                self.model,
                lora_weights,
                torch_dtype=torch.float16,
            )
        else:
            print("no avaliable GPU")

        self.model.config.pad_token_id = self.tokenizer.pad_token_id = 0  # pad id，绝大多数填充id均为0，但不排除有例外
        self.lora_model.config.pad_token_id = 0

        self.model.eval()

        # training and testing paths
        data_fields = {"train": train_path, "test": test_path}
        data = load_dataset("json", data_files=data_fields)
        test_data = data["test"]
        print("*"*40+"test results..."+"*"*40)

        if torch.__version__ >= "2" and sys.platform != "win32":
            self.model = torch.compile(self.model)  # pytorch 2.0 后进行编译可以显著提升训练效率
            self.lora_model = torch.compile(self.lora_model)

        # Save test results
        with open(output_dir, 'a') as file:
            for data in test_data:
                instruction = data['instruction']
                input = data['input']
                labels = data['output']
                
                file.write("Instruction: " + instruction + "\n")
                file.write("Input: " + str(input) + "\n")
                file.write("Labels: " + str(labels) + "\n")
                                
                file.write("-"*16 + "lora model" + "-"*16 + "\n")
                file.write("Response: " + str(self.evaluate(self.lora_model, instruction, input=input)) + "\n")
                
                file.write("\n\n")
