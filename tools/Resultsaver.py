# -*- coding: UTF-8 -*-
import os
import time 
import pickle as pk

def screen_to_file(str1,file_path):
    with open(file_path,"a") as f:
        f.write(str1+"\n")


class Results():
    def __init__(self, hyperParas:str, approach="gpt-3.5-turbo",dataSets="data") -> None:
        self.approach = approach
        self.dataSets = dataSets
        self.parameters = hyperParas
        self.rootpath = os.getcwd()
        self.time = time.strftime("%a %b %d %H-%M-%S", time.localtime())

    def savelogDApp(self,info:str):
        path = self.rootpath + os.sep + "result" + os.sep + self.approach + os.sep + self.dataSets + os.sep + "log"
        recordTime = self.time
        file = path + os.sep + self.parameters + recordTime
        if not os.path.exists(path):
            os.makedirs(path)
        screen_to_file(info, file)

    def savelogDData(self,info:str):
        path = self.rootpath + os.sep + "result" + os.sep + self.dataSets + os.sep + self.approach + os.sep + "log"
        recordTime = self.time
        file = path + os.sep + self.parameters + recordTime
        if not os.path.exists(path):
            os.makedirs(path)
        screen_to_file(info, file)

    def savepickleDApp(self,data,flag):
        path = self.rootpath + os.sep + "result" + os.sep + self.approach + os.sep + self.dataSets + os.sep + "pick" 
        file = path + os.sep + flag
        if not os.path.exists(path):
            os.makedirs(path)
        with open(file+".pkl","wb") as f:
            pk.dump(data,f)

    def savepickleDData(self,data,flag):
        path = self.rootpath + os.sep + "result" + os.sep + self.dataSets + os.sep + self.approach + os.sep + "pick" 
        file = path + os.sep + flag
        if not os.path.exists(path):
            os.makedirs(path)
        with open(file+".pkl","wb") as f:
            pk.dump(data,f)