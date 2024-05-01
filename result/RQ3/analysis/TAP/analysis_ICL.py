import os
from sklearn.metrics import classification_report, confusion_matrix
import json


def parse_txt(text):
    result=0.0
    # 去除多余的换行符和空格
    text = text.strip()

    # 查找 "vulnerability" 键之后的内容
    key_value_pairs = text.split('"confidence":', 1)

    if len(key_value_pairs) > 1:
        try:
            vulnerability_content = key_value_pairs[1].strip()
            conf = vulnerability_content.split("vulnerability")[0].replace(",","").replace("\"","")
            conf = float(conf)
            result = conf
        except:
            result = 0.0
    return result

def calculate_percentage(data):
    count1 = 0
    count2 = 0
    count3 = 0
    count4 = 0
    count5 = 0

    for num in data:
        if num > 0.5:
            count1 += 1
        elif 0.3 <= num <= 0.5:
            count2 += 1
        elif 0.1 <= num < 0.3:
            count3 += 1
        elif 0.05 <= num < 0.1:
            count4 += 1
        else:
            count5 += 1

    total = len(data)
    percentage1 = count1 / total * 100
    percentage2 = count2 / total * 100
    percentage3 = count3 / total * 100
    percentage4 = count4 / total * 100
    percentage5 = count5 / total * 100

    return percentage1, percentage2, percentage3, percentage4, percentage5  

# log_file = "./Android/GPT/log/detection"#修改为需要分析的日志文件的相对路径
# log_file = "./Chrome/GPT/log/detection"
# log_file = "./Qemu/GPT/log/detection"
log_file = "./Linux/GPT/log/result"
# log_file = "./Chrome/GPT/log/result"
# log_file = "./Qemu/GPT/log/result"
# log_file = "./Android/GPT/log/result"

lab = []
jud = []
file_path = os.path.join(os.getcwd(),log_file)    
list_ICL = []
with open(file_path, 'r',encoding="utf-8") as file:
    lines = file.readlines()
    foundflag = False
    judgetxt = "" 
    lab_value = -1
    iter = 0
    for line in lines:
        if line.startswith("**GroundTruth**"):
            lab_value = int(line.split("**GroundTruth**_")[1])
            if lab_value == 1: count = True
            else: count = False
        if line.startswith("-"*40+"DISC"+"-"*40 + "\n"):
            foundflag = True
            continue
        if line.startswith("**START**"):
            foundflag = False
            cleantxt = judgetxt.replace("\n", "")
            parse_txt(cleantxt)
            try:
                if count:
                    judge = parse_txt(cleantxt)
                    print(judge)
                    list_ICL.append(judge)
            except:
                pass
            judgetxt = "" 
        if foundflag:judgetxt+=line

 

print(list_ICL)
percentage1, percentage2, percentage3, percentage4, percentage5 = calculate_percentage(list_ICL)



print("大于0.5的数据占比：", percentage1)
print("0.3到0.5之间的数据占比：", percentage2)
print("0.1到0.3之间的数据占比：", percentage3)
print("0.05到0.1之间的数据占比：", percentage4)
print("小于0.05的数据占比：", percentage5)        

