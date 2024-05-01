'''
Author: Yanjing Yang
Date: 2024-04-19 14:54:18
FilePath: \DLAP\Detector.py
Description: Perform detection, and parse the results

Copyright (c) 2023 by NJU(Nanjing University), All Rights Reserved. 
'''


from LLMmodel.GPT import GPT
from LLMmodel.Qwen import Toyi
import json

class StrDataanalysis:
    def __init__(self, LLM = GPT()):
        self.LLM = LLM
    def _get_dict_results(self,answer):
        # Find the start position of the last dictionary in the text
        start_index = answer.rfind('{')
        # Extract part of the text of the last dictionary
        json_text = answer[start_index:]
        # Parsing a dictionary
        try:
            data = json.loads(json_text)
        except:
            print("load json difficult, try to analyze str")
            data = self._err_handle_func(answer)

        return data
    def _err_handle_func(self,err:str):
        results={
            "vulnerability":0,
            "reason":-1,
        }
        findjud = err.split('vulnerability')[1]
        jud = findjud.split('influence Components')[0]
        if "yes" in jud or "Yes" in jud or "true" in jud or "True" in jud:
            results['vulnerability']=1
            findreason = findjud.split('influence Components')[1]
            reason = findreason.split('reason')[1]
            results['reason']=reason
            pass
        return results
    def analysis(self,data):
        result = self._get_dict_results(data)
        return 1
    
class Detector:
    def __init__(self, prompts, LLM = GPT()):
        self.LLM = LLM
        self.prompts = prompts
    def execute(self):
        answer = self.LLM.get_completion(self.prompts)    
        return answer
        
