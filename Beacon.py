'''
Author: Yanjing Yang
Date: 2023-07-09 14:53:39
FilePath: \DLAP\Beacon.py
Description: Read the preliminary judgment results of small models and static tools

Copyright (c) 2023 by NJU(Nanjing University), All Rights Reserved. 
'''
import os
from collections import Counter
import yaml
from LLMmodel.GPT import GPT

from gensim.similarities import Similarity
from gensim import corpora, models
from nltk import word_tokenize
from nltk.corpus import stopwords

flawfinder_mapping = {
    "CWE-20":['improper input validation', 'improper syntactic validation', 'path traversal', 'injection', 'format string injection', 'command injection', 'code injection'],
    "CWE-22":['improper input validation', 'improper syntactic validation', 'path traversal', 'injection', 'command injection', 'code injection'],
    "CWE-78":['buffer overflow', 'pointer issues', 'null pointer dereference', 'pointer allocate/free issue', 'pointer range limitation'],
    "CWE-119":['Out-of-Bounds Access','improper exception handling', 'improper resource control', 'resource exposure'],
    "CWE-120":['improper input validation', 'improper syntactic validation', 'path traversal', 'injection', 'format string injection', 'command injection', 'code injection'],
    "CWE-126":['buffer overflow'],
    "CWE-134":['improper input validation', 'improper syntactic validation'],
    "CWE-190":['numerical resource limitation','wrap-around error'],
    "CWE-250":['access control', 'improper authorization', 'improper authentication'],
    "CWE-327":["broken cryptographic algorithm"],
    "CWE-362":["race condition"],
    "CWE-676":["protection mechanism failure"],
    "CWE-732":['access control', 'improper authorization'],
    "CWE-785":['path traversal', 'access control'],
    "CWE-807":['improper input validation','injection'],
    "CWE-829":['insufficiently trustworthy component',"access control","coding standards"],
    "CWE-119!/CWE-120":['improper input validation', 'improper syntactic validation', 'path traversal', 'injection', 'format string injection', 'command injection', 'code injection']
}

class Beacon:
    """
    A template class for detecting vulnerabilities in code.
    """
    def __init__(self, code):
        self.code = code
    
    def detect_vulnerability_init(self):
        
        # TODO: Implement remote code execution detection logic.
        # Return True if remote code execution vulnerability is detected, otherwise False
        pass



class Beacon_Statics(Beacon):
    """
    A class for detecting vulnerabilities in Linux code with variable detection.
    """
    def __init__(self, code, codesensor_path:str="./codesensor/CodeSensor.jar",LLM = GPT()):
        super().__init__(code)
        self.sensorfile = codesensor_path
        current_dir = os.getcwd()
        # Check that the tmp folder exists
        tmp_dir = os.path.join(current_dir, 'tmp')
        if not os.path.exists(tmp_dir): os.mkdir(tmp_dir)
        operfile = os.path.join(tmp_dir,"covar.c")
        with open(operfile, 'w') as f:
            f.write(self.code) 
        self.ast_result = os.path.join(tmp_dir,"ast.txt")
        os.system("java -jar "+self.sensorfile+" {} > {}".format(operfile,self.ast_result))
        self._weights = [7,6,3,2]
        self._beacon_results = {}

    # Processing Beacon results using parent-child relationships
    def _relationship_taxonomy(self,beacon_results:list)->list:
        Taxonomy_tree4vul={
            'access control':['improper authorization', 'improper authentication'],
            'protection mechanism failure':['missing sensitive data encryption', 'broken cryptographic algorithm'],
            'coding standards':['prohibited code usage', 'insufficiently trustworthy component'],
            'time-related Error':[],
            'improper exception handling':[],
            'improper resource control':['resource exposure', 'uncontrolled resource consumption', 'wrong phase resource operation'],
            'insufficient control flow management':['race condition', 'excessive iteration', 'incorrect behavior order'],
            'uncontrolled resource consumption':['out-of-bounds access', 'buffer overflow', 'unlimited resource allocation'],
            'pointer issues':['null pointer dereference', 'pointer allocate/free issue',  'pointer range limitation'],
            'numerical resource limitation':['wrap-around error', 'incorrect integer bit shift', 'insufficient real number precision'],
            'incorrect string length calculation':[],
            'pointer calculation error':[],
            'off-by-one error':[],
            'division by zero':[],
            'encoding error':[],
            'improper data validation':['improper input validation', 'improper syntactic validation', 'path traversal'],
            'injection':['format string injection', 'command injection', 'code injection'],
            'inconsistent unverified':[],
            'improper special elements':[],
            'unknown':[]
        }
        updated_list = beacon_results.copy()
        for parent, children in Taxonomy_tree4vul.items():
            if parent in updated_list and any(child in updated_list for child in children):
                updated_list.remove(parent)
        return updated_list

    
    # Resolve the identification of Buffer-related vulnerabilities
    def _has_string_functions(self,function_list):
        string_functions = ['strcpy', 'strncpy', 'strcat', 'strncat', 'gets', 'fgets', 'scanf', 'sscanf']
        for func in function_list:
            if func in string_functions:
                return True
        return False

    def _has_memory_functions(self,function_list):
        memory_functions = ['memcpy', 'memmove']
        for func in function_list:
            if func in memory_functions:
                return True
        return False

    def _has_format_functions(self,function_list):
        format_functions = ['sprintf', 'snprintf']
        for func in function_list:
            if func in format_functions:
                return True
        return False
    
    # Extracting function calls
    def _extract_buffer_sink(self)->bool:
        functions = []  
        with open(self.ast_result,'r', encoding='latin1') as fp:
            lines = fp.readlines()
            for line in lines:
                oplist = line.split("\t")
                if(oplist[0]=="call"):
                    functions.append(oplist[-1].replace("\n",""))
        if self._has_string_functions(functions):
            return True
        if self._has_memory_functions(functions):
            return True
        if self._has_format_functions(functions):
            return True
        else:
            return False

    # Update record dictionary
    def _update_dict(self, dictionary, key , weight):
        if key in dictionary:
            dictionary[key] += weight
        else:
            dictionary[key] = weight
        return dictionary

    def _clean_Beacon(self, lst:list)->list:
        updated_list = []
        for item in lst:
            updated_item = item.replace("vulnerability classes: ", "")
            updated_list.append(updated_item)
        return updated_list
    
    # The four Beacon algorithms assembled
    def _beacon_buffer_sink(self):
        if(self._extract_buffer_sink()):
            self._update_dict(self._beacon_results,"Buffer Overflow".lower(), self._weights[0])
            self._update_dict(self._beacon_results,"Out-of-Bounds Access".lower(), self._weights[0])

    def _beacon_flawsfinder(self):
        current_dir = os.getcwd()
        tmp_dir = os.path.join(current_dir, 'tmp')
        if not os.path.exists(tmp_dir): os.mkdir(tmp_dir)
        operfile = os.path.join(tmp_dir,"covar.c")
        resultfile = os.path.join(tmp_dir,"statics_result1.csv")
        opstr = "flawfinder --csv >{} {}".format(resultfile,operfile)
        os.system(opstr)
        import pandas as pd
        df = pd.read_csv(resultfile)
        flawfinder_result = df['CWEs']
        cwe_data =flawfinder_result.tolist()
        recog_info = []
        for cwe_info in cwe_data:
            if cwe_info == 'CWE-120, CWE-20':
                recog_info += flawfinder_mapping['CWE-20']
                recog_info += flawfinder_mapping['CWE-120']
            else:
                recog_info += flawfinder_mapping[cwe_info]
                # Convert the list to a set to remove duplicates
        set_recog_info = set(recog_info)
        list_recog_info = list(set_recog_info)
        # Add the result to the beacon judgment list
        for answer in list_recog_info:
            self._update_dict(self._beacon_results,answer.lower(), self._weights[1]) 

    def detect_vulnerability_init(self,addr,conf,K:int=2):
        """
        Detects remote code execution vulnerability in Linux code with variable detection.
        """
        autoflag = 0
        # flawsfinder
        lenthbeacon = len(self._beacon_results)
        self._beacon_flawsfinder() 
        if(len(self._beacon_results)>lenthbeacon):
            autoflag = 1
            print("flawfinder:",self._beacon_results)
        
        lenthbeacon = len(self._beacon_results)


        lenthbeacon = len(self._beacon_results)
        self._beacon_buffer_sink()
        if(len(self._beacon_results)>lenthbeacon):
            autoflag = 1
            print("bufferreg:",self._beacon_results)
        
        
        sinkVul = sorted(self._beacon_results, key=self._beacon_results.get, reverse=True)
        sinkVul = self._relationship_taxonomy(sinkVul)
        sinkVul = self._clean_Beacon(sinkVul)
        if(autoflag == 0):
            cleanSinkVul = sinkVul[:1]
        else:
            cleanSinkVul = sinkVul  
                
        # Return code execution vulnerability classify
        if(autoflag == 0 and len(cleanSinkVul)<K and "auto_prompts" not in cleanSinkVul):
            cleanSinkVul.append("auto_prompts")
        smallModelVul = conf
        res = {
            "staticsVul": cleanSinkVul[0],
            "smallModelVul": smallModelVul
        }
        return res




