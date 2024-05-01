import re
from sklearn.metrics import classification_report, confusion_matrix
from sklearn.metrics import precision_score, recall_score, f1_score, matthews_corrcoef



def find_label_responses(file_name):
    with open(file_name, 'r',encoding='utf-8') as file:
        content = file.read()

    # 查找所有的以 "Response" 开头的行
    labels = re.findall(r"^Labels: .*", content, re.M)
    responses = re.findall(r"^Response: .*", content, re.M)
    # responses = responses[1::2]

    for id, res in enumerate(responses):
        if not res.endswith('</s>'):
            print(res)
    #         del labels[id]
    #         del responses[id]
    for id, res in enumerate(responses):
        if 'list index out of range' in res:
            print(res)
            # del labels[id]
            # del responses[id]
            responses[id]="Response: ['Error, list index out of range']</s>"

    print(len(labels))
    print(len(responses))

    return labels, responses


dataset = "Android" # "Linux", "Chrome", "Qemu","Android"
labels, responses = find_label_responses('output_DLAP_Vicuna13B_{}.txt'.format(dataset))

labels_result_binary = []
responses_result_binary = []
labels_result_binary = [item.split('Labels: ')[1] for item in labels]
responses_result_binary = [item.split('Response: ')[1].split('</s>')[0] for item in responses]

labels_result = []
responses_result = []

for item in labels_result_binary:
    if item =='Yes':
        labels_result.append(1)
    else:
        labels_result.append(0)

for item in responses_result_binary:
    if item =='Yes':
        responses_result.append(1)
    else:
        responses_result.append(0)



# 假设您已经有了真实标签（y_true）和预测标签（y_pred）
y_true = labels_result
y_pred = responses_result
import pickle
with open("index.pkl", "wb") as f:
    pickle.dump(y_true, f)

# 计算分类报告
report = classification_report(y_true, y_pred)

# 打印分类报告
print(report)

# 计算精确率（Precision）
precision = precision_score(y_true, y_pred)
print("Precision:", precision)

# 计算召回率（Recall）
recall = recall_score(y_true, y_pred)
print("Recall:", recall)

# 计算F1-score
f1 = f1_score(y_true, y_pred)
print("F1-score:", f1)
# 计算混淆矩阵
tn, fp, fn, tp = confusion_matrix(y_true, y_pred).ravel()

# 计算FPR（误报率）
fpr = fp / (fp + tn)
print("FPR:", fpr)
# 计算MCC（Matthews相关系数）
mcc = matthews_corrcoef(y_true, y_pred)
print("MCC:", mcc)