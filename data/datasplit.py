import json
import os
import sys
from sklearn.model_selection import train_test_split

dataset = "Android"
inputfile = os.path.join(os.getcwd(), "data", dataset, dataset + "14_linevul.json")
train_file = os.path.join(os.getcwd(), "data", dataset, "train.json")
test_file = os.path.join(os.getcwd(), "data", dataset, "test.json")


with open(inputfile, 'r', encoding='utf-8') as json_file:
    data = json.load(json_file)

split_index = int(len(data) * 0.7)
print(split_index)
train_data = data[:split_index]
test_data = data[split_index:]

with open(train_file, 'w', encoding='utf-8') as train_file:
    json.dump(train_data, train_file, ensure_ascii=False, indent=4)

with open(test_file, 'w', encoding='utf-8') as test_file:
    json.dump(test_data, test_file, ensure_ascii=False, indent=4)

print("训练集和测试集已保存到 train.json 和 test.json 文件中。")