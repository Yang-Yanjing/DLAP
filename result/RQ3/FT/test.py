from Vicuna import Vicuna_Lora

llm = Vicuna_Lora("Vicuna-13B")
llm.test(lora_weights= "lora-checkpoint/DLAP-Android/checkpoint-300",
         train_path = "DLAP/Android/train.json", 
         test_path = "DLAP/Android/test.json",
         output_dir = 'output_DLAP_Vicuna13B_Android.txt')
 