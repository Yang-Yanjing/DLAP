from Vicuna import Vicuna_Lora

llm = Vicuna_Lora("Vicuna-13B")
llm.prepared()
llm.load_data(train_path="DLAP/Android/train.json",
              test_path="DLAP/Android/test.json")
llm.train()