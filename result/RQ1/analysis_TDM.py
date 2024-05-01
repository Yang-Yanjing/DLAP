import os
from sklearn.metrics import classification_report, confusion_matrix
import json
def parse_txt(text):
    result={
        "vulnerability":-1
    }
    # 去除多余的换行符和空格
    text = text.strip()

    # 查找 "vulnerability" 键之后的内容
    key_value_pairs = text.split('"confidence":', 1)

    if len(key_value_pairs) > 1:
        try:
            vulnerability_content = key_value_pairs[1].strip()
            conf = vulnerability_content.split("vulnerability")[0].replace(",","").replace("\"","")
            conf = float(conf)
            if conf>0.5:
                result["vulnerability"]=1
            else:
                result["vulnerability"]=0
        except:
            print("Conf error")
            key_value_pairs = text.split('"confidence":', 1)
            vulnerability_content = key_value_pairs[1].strip()
            vul = vulnerability_content.split("influence Components")[0].replace(",","").replace("\"","")
            if("yes" in vul.lower()):
                result["vulnerability"]=1
            else:
                result["vulnerability"]=0
            
    else:
        print("No 'vulnerability' key found.")
    return result


dl = "sysevr" # "sysevr""devign"
# log_file = "./Android/GPT/log/detection"#修改为需要分析的日志文件的相对路径
# log_file = "./Chrome/GPT/log/detection"
# pp = "./Qemu/GPT/log/detection"
# pp = "./Linux/GPT/log/result"
# pp = "./Chrome/GPT/log/result"
pp = "./Qemu/GPT/log/result"
# pp = "./Android/GPT/log/result"
log_file = pp+"_"+dl
lab = []
jud = []
file_path = os.path.join(os.getcwd(),log_file)    
with open(file_path, 'r',encoding="utf-8") as file:
    lines = file.readlines()
    foundflag = False
    judgetxt = "" 
    lab_value = -1
    for line in lines:
        if line.startswith("**GroundTruth**"):
            lab_value = int(line.split("**GroundTruth**_")[1])
        if line.startswith("-"*40+"DISC"+"-"*40 + "\n"):
            foundflag = True
            continue
        if line.startswith("**START**"):
            foundflag = False
            cleantxt = judgetxt.replace("\n", "")
            parse_txt(cleantxt)
            judge = parse_txt(cleantxt)
            if(judge["vulnerability"] == -1):
                continue
            
            jud.append(judge["vulnerability"])
            lab.append(lab_value)
            judgetxt = "" 
        if foundflag:judgetxt+=line
        
        
# jud = jud[1:]  
# lab = lab[1:]          
print("lab{}".format(lab))
print("judge{}".format(jud))
print("The confusion matrix: \n")
target_names = ["LLM-Non-vulnerable","Vulnerable"] #non-vulnerable->0, vulnerable->1
print(confusion_matrix(lab, jud, labels=[0,1]))
print("\r\n")
report=classification_report(lab, jud, target_names=target_names)
print(report)
from sklearn.metrics import precision_score, recall_score, f1_score, matthews_corrcoef

# 实际标签
y_true = lab
# 预测标签
y_pred = jud

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
