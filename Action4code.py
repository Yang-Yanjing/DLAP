'''
Author: Yanjing Yang
Date: 2024-04-19 14:54:18
FilePath: \DLAP\Action4code.py
Description: The file in data is read to process the dataset for later detection

Copyright (c) 2023 by NJU(Nanjing University), All Rights Reserved. 
'''
import pandas as pd
import os
import json
import yaml
from codesensor.utils import check_ast_for_func

def split_into_chunks(target:str, max_length:int=950)->list:
    chunks = []
    current_chunk = ""
    for token in target:
        if len(current_chunk) + len(token) <= max_length:
            current_chunk += token
        else:
            chunks.append(current_chunk)
            current_chunk = token
    if current_chunk:
        chunks.append(current_chunk)
    return chunks

# The data read template class
class DataProcessor:
    def __init__(self, file_path, verbose=1, seed=1):
        self.file_path = file_path
        self.verbose = verbose
        self.seed = seed
         
    def read_data(self):
        if self.verbose > 0:
            print("Reading data from file:", self.file_path)
    def get_data(self):
        if self.verbose > 0:
            print("Getting data from file:", self.file_path)

class Action_json_data(DataProcessor):
    def __init__(self, file_path, dpmodel, verbose=1, seed=1):
        super().__init__(file_path=file_path, verbose=verbose, seed=seed)
        self.dpmodel = dpmodel
        print("{} is used as superDL_ICL".format(self.dpmodel))

    def _read_data(self):
        if self.verbose > 0:
            print("Reading data from file:", self.file_path)
        with open(self.file_path, 'r',encoding="utf-8") as json_file:
            json_data = json.load(json_file)
        return json_data
    
    def get_data(self, slice_size: int = None) -> dict:
        seed = self.seed
        codes = []
        labels = []
        addrs = []
        confidences = []
        json_data = self._read_data()
        count = len(json_data)
        if self.verbose > 0:
            print("data count:", count)
        if slice_size is None:
            slice_size = count
            
        start_index = seed-1
        end_index = min(start_index + slice_size, count) if slice_size is not None else count
        for i, single_data in enumerate(json_data[start_index:end_index]):
            code = single_data.get('code')
            label = single_data.get('label')    
            confidence = single_data.get(self.dpmodel)        
            codes.append(code)
            labels.append(label)
            confidences.append(confidence)
            dataset = os.path.basename(os.path.split(self.file_path)[-2])
            
            if dataset == "debian":
                addrs.append("https://drive.google.com/drive/folders/1KuIYgFcvWUXheDhT--cBALsfy1I4utOy")
            else:
                cve = single_data.get('addr')
                addrs.append(cve)
            
        res = {
            "codes": codes,
            "labels": labels,
            "addrs": addrs,
            "confidences":confidences
        }
        return res



# dataset = "FFmpeg"
# datapath=os.getcwd()+os.sep+"data"+os.sep+dataset+os.sep+"test.json"
# Debian_data = Action_json_data(file_path=datapath, seed=2)
# print(Debian_data.get_data(1)["codes"])
