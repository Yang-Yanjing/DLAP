'''
Author: Yanjing Yang
Date: 2024-05-01 13:09:55
FilePath: \DLAP\mainDect.py
Description: The combination forms the main program and forms the automation

Copyright (c) 2024 by NJU(Nanjing University), All Rights Reserved. 
'''

from tools.Translate import YoudaoTranslate
from LLMmodel.GPT import GPT
import json
import pickle
from Action4code import *
from Beacon import Beacon_Statics
from ChainofThought import *
from Generpromp import DLprompts
from SupICL import SuperICL
from Detector import Detector,StrDataanalysis
from LLMmodel.GPT import GPT
from LLMmodel.LLama import Vicuna
from tools.Resultsaver import Results

from sklearn.metrics import classification_report, confusion_matrix
import json
import pickle as pk
import os
import yaml

# Get the classification results and store them in log
def Classification_results(Judgements:list,Labels:list,Results)->None:
    DownLoader = Results
    print("The confusion matrix: \n")
    log = "\n"
    log += "The confusion matrix: \n"
    log += str(confusion_matrix(Labels, Judgements, labels=[0,1]))
    log += "\r\n"
    target_names = ["Non-vulnerable","Vulnerable"] #non-vulnerable->0, vulnerable->1
    print (confusion_matrix(Labels, Judgements, labels=[0,1]))  
    print ("\r\n")
    report=classification_report(Labels, Judgements, target_names=target_names)
    print (report)
    log += report
    DownLoader.savelogDData(info=log)


config_path = os.path.join(os.getcwd(),"config","config.yaml")#debian.yaml FFmpeg.yaml LibTIFF.yaml
config = yaml.safe_load(open(config_path,'r',encoding="UTF-8"))
os.environ["HTTP_PROXY"] = os.environ.get('http_proxy')
os.environ["HTTPS_PROXY"] = os.environ.get('https_proxy')


dataset = config.get('LLM_Func').get('Action4code').get('data_set')

size = config.get('LLM_Func').get('Action4code').get('data_size')
seed = config.get('LLM_Func').get('Action4code').get('seed')
B_param = config.get('LLM_Func').get('Beacon').get('dlnetwork')
C_param = config.get('LLM_Func').get('Chain').get('algorithm')
D_param = config.get('LLM_Func').get('Discern').get('algorithm')
sample_num = config.get('LLM_Func').get('Discern').get('ICLnum')

# Model and dataset selection
LLMmodel=config.get('LLM_Func').get('LLM_model')
if LLMmodel == "Toyi":
    print("Using Qwen-74B model...") 
    LargeLM = Toyi()
elif LLMmodel == "Local13B":
    print("Using Local13B model...") 
    LargeLM = Vicuna()
else:
    print("Using GPT model...")
    LargeLM = GPT()
deep_model = B_param
paras = "_Size_"+str(size)+"_DL_"+deep_model

DownLoader = Results(hyperParas=paras, approach=LLMmodel, dataSets=dataset)
datapath = os.getcwd()+os.sep+"data"+os.sep+dataset+os.sep+"Gtest.json"
ICL_path = os.path.join(os.getcwd(),"data", dataset,"train.json")
test_data = Action_json_data(file_path=datapath, verbose = -1, seed=seed, dpmodel=deep_model)
codes = test_data.get_data(slice_size=size)["codes"]
labels = test_data.get_data(slice_size=size)["labels"]
addrs = test_data.get_data(slice_size=size)["addrs"]
confidences = test_data.get_data(slice_size=size)["confidences"]
iter = 0;judgelist = [];labellist = []
for code, label, addr, conf in zip(codes, labels, addrs, confidences):
    log = "\n"+ "**START**_{}".format(addr) + "\n"
    log += "\n"+"**iteration**_{}".format(iter)+"\n"
    log += "\n"+"**GroundTruth**_{}".format(label)+"\n"
    # ----------Beacon ----------
    code_Beacon = Beacon_Statics(LLM=LargeLM,code=code)
    try:
        B_result = code_Beacon.detect_vulnerability_init(addr=addr, conf=conf)
        log += "\n" + "**Beacon**_{}".format(str(B_result)) + "\n"
    except Exception as e:
        # Report the error process (very low probability) and discard the x, label this time
        print("B error",e)
        log = "**error occurs**_{}".format(str(addr)) + "\n"
        log += "-*"*80+ "\n"
        DownLoader.savelogDData(info=log)
        continue
    DownLoader.savelogDData(info=log)
    # ----------COT ----------
    try:
        COT = Chainofthought(LLM=LargeLM)
        C_result = COT.cot_analysis(B_result['staticsVul'],code,B_result['smallModelVul'])
        log = "-"*40+"COT"+"-"*40 + "\n"
        for num,cot in enumerate(C_result):
            log += cot+"\n"  
    except Exception as e:
        print("C error",e)
        if (str(e) == "empty chain error"):
            log = "empty chain error**_{}".format(str(addr)) + "\n"
        else:log = "**error occurs**_{}".format(str(addr)) + "\n"
        log += "-*"*80+ "\n"
        DownLoader.savelogDData(info=log)
        continue
    DownLoader.savelogDData(info=log)

    try:   
        # Concatenated prompts
        ICL = SuperICL(init_num_train_samples=sample_num,LLM=LargeLM,sample_file_path=ICL_path)
        SICL=ICL.execute(code,B_result['smallModelVul'])
        DLAP = DLprompts()
        DLApromts = DLAP.get_prompts(code=code,SICL=SICL,Beacon=B_result,COT=C_result)
        # DLApromts = DLAP.get_prompts(code=code,SICL=SICL,Beacon=B_result,COT="C_result")
        log = "-"*40+"ICLPrompts"+"-"*40 + "\n"
        if SICL["tokenerror"]:
            log += "tokenerror" + "\n"
        log += DLApromts + "\n"
        DownLoader.savelogDData(info=log)
    except:
        print("ICL error",e)

        log = "**tokenerror occurs**_{}".format(str(addr)) + "\n"
        log += "-*"*80+ "\n"
        DownLoader.savelogDData(info=log)
        continue

    # ----------Detector ----------
    try:
        VD = Detector(LLM=LargeLM,prompts=DLApromts)
        log = "-"*40+"DISC"+"-"*40 + "\n"
        D_result = VD.execute()
        log += D_result + "\n"
    except Exception as e:
        print("D error",e)
        log = "**error occurs**_{}".format(str(addr)) + "\n"
        log += "-*"*80+ "\n"
        DownLoader.savelogDData(info=log)
        continue 
    
    DownLoader.savelogDData(info=log)
    
log = "**START**_{}".format("yyj") + "\n"
log += "end"
DownLoader.savelogDData(info=log)     
