'''
Author: Yanjing Yang
Date: 2024-05-01 13:09:55
FilePath: \DLAP\SupICL.py
Description:Construct ICL prompts

Copyright (c) 2024 by NJU(Nanjing University), All Rights Reserved. 
'''


from LLMmodel.GPT import GPT
from LLMmodel.Qwen import Toyi
import re
import json
import heapq
from datasketch import MinHash, MinHashLSH
import nltk

def count_tokens(string):
    tokens = nltk.word_tokenize(string)
    return len(tokens)

def create_minhash(data):
    minhash = MinHash(num_perm=128)  # num_perm Is the number of hash functions, which can be adjusted as needed
    for d in data:
        minhash.update(d.encode('utf8'))
    return minhash

class SuperICL:
    def __init__(self, sample_file_path, init_num_train_samples:int, LLM = GPT(), verbose=1,dpmodel='linevul'):
        self.verbose = verbose
        self.num_train_samples = init_num_train_samples
        self.deep_train_info =[]
        self.llm = LLM
        with open(sample_file_path, 'r', encoding="utf-8") as file:
            json_data = json.load(file)
        self.codeinfo = []
        self.confidencesinfo = []
        self.labelsinfo = []
        for obj in json_data:
            A_code = obj.get('code')
            A_confidence = obj.get(dpmodel)
            self.codeinfo.append(A_code)
            self.labelsinfo.append(1)
            self.confidencesinfo.append(A_confidence)
        self.lsh = MinHashLSH(threshold=0, num_perm=128)
        for idx, sentence in enumerate(self.codeinfo):
            minhash = create_minhash(list(sentence))
            self.lsh.insert(idx, minhash)

    def _remove_non_numeric(self,text):
        pattern = r'[^0-9.]'  # Matches characters other than numbers and decimal points
        result = re.sub(pattern, '', text)
        return result

    def _remove_extra_decimal_points(self,text):
        pattern = r'(?<=\d)\.(?=\d)'
        result = re.sub(pattern, '', text)
        return result
    
    def _sample_indices_by_confidence(self, code, confidence)->list:
        # Sample the code with the highest similarity, and the corresponding confidence
        query_minhash = create_minhash(list(code))
        results = self.lsh.query(query_minhash)
        similarity_scores = []
        for result in results:
            minhash = create_minhash(list(self.codeinfo[result]))
            jaccard_similarity = query_minhash.jaccard(minhash)
            heapq.heappush(similarity_scores, (jaccard_similarity, result))

        Incontext = []
        # Output all similar sentences and their similarity scores
        if confidence>0.5:
            for score, index in similarity_scores:
                # print(score, index)
                ICL_code = self.codeinfo[index]
                ICL_label = self.labelsinfo[index]
                ICL_confidence = self.confidencesinfo[index]
                if float(ICL_confidence) > 0.5:
                    Incontext.append([ICL_code, float(ICL_confidence), int(ICL_label)])
        else:
            for score, index in similarity_scores:
                ICL_code = self.codeinfo[index]
                ICL_label = self.labelsinfo[index]
                ICL_confidence = self.confidencesinfo[index]
                if float(ICL_confidence) <= 0.5:
                    Incontext.append([ICL_code, float(ICL_confidence), int(ICL_label)])
        return Incontext



    def _creat_prompt(self,test_code,SmallModelConfidence):
        
        prompt = "Please give your answers according to the following examples.\nexample:\n"
        # The sampling is gradually attenuated according to the maximum value set by the sampling, and if there is a problem, the number of samples is attenuated
        incotext = self._sample_indices_by_confidence(test_code, SmallModelConfidence)
        label = 1
        for index in incotext[:self.num_train_samples]:
            code = index[0]
            confidence = index[1]
            prompt += f'{{\n "input": "{code}",\n "label": "{label}"\n,\n "confidence": "{confidence}"\n}}\n'
        SmallModelJud = 1 if SmallModelConfidence>0.5 else 0
        print("SmallModelJud: {}".format(SmallModelJud))
        prompt += "according to the example show your confidence and label answers:"
        prompt += f'{{\n "input": "{test_code}",\n "label": "{label}"\n,'
        return prompt
    
    def _parse_answer(self, answer:str)->dict:
        judge={
            "confidence":0.0,
            "label":"1",
            'tokenerror':False
        }
        precontent = answer.split("\"confidence\":")[-1]
        pconfidence = precontent.split("\"label\":")[0]
        confidence = pconfidence.replace(",","").replace("\n","").replace("\"","").replace("}","")
        try:
            # judge["confidence"]=float(self._remove_extra_decimal_points(self._remove_non_numeric(confidence)))
            print(confidence)  
            judge["confidence"]=confidence
        except:
            judge["confidence"]="0.5"
        return judge

    def execute(self, test_code, confidence):
        # while True:
            # try:
            #     Template = self._creat_prompt(test_code,confidence)
            #     # print(Template)
            #     r = self.llm.get_completion(Template)
            #     break
            # except:
            #     self.num_train_samples-=1
            #     continue
        Template = self._creat_prompt(test_code,confidence)
        # print(Template)
        if count_tokens(Template)>16385:
            judge = {
                'confidence': float(confidence), 
                'label': '1',
                'tokenerror':True
            }
            return judge
        r = self.llm.get_completion(Template)
        judge = self._parse_answer(r)
        print(judge)
        return judge

