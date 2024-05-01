'''
Author: Yanjing Yang
Date: 2023-08-16 17:37:01
FilePath: /Beacon_LLM/llm4-sec/LLMmodel/GPT.py
Description: 

Copyright (c) 2023 by NJU(Nanjing University), All Rights Reserved. 
'''
import openai 
import os
import ast
import time
import random as rd

openai.api_key = "your -open ai sk"
os.environ["HTTP_PROXY"] = "your -PROXY if need"
os.environ["HTTPS_PROXY"] = "your -PROXY if need"

class GPT():
    def __init__(self, model="gpt-3.5-turbo",temperature=0) -> None:
        self.model = model
        self.temperature = temperature
            
    def get_completion(self,prompt):
        messages = [{"role": "user", "content": prompt}]
        try:
            response = openai.ChatCompletion.create(
                model=self.model,
                messages=messages,
                temperature=self.temperature, # this is the degree of randomness of the model's output
            )
        except Exception as e:
            print("Error:",e)
            time.sleep(rd.randint(1, 5))
            print("Second try, Use the same model")
            try:
                response = openai.ChatCompletion.create(
                model=self.model,
                messages=messages,
                temperature=self.temperature, # this is the degree of randomness of the model's output
            )
            except Exception as e:
                print("Error:",e)
                time.sleep(rd.randint(1, 5))
                print("third try, Use the 16k model")
                self.model = "gpt-3.5-turbo-16k"
                try:
                    response = openai.ChatCompletion.create(
                        model=self.model,
                        messages=messages,
                        temperature=self.temperature, # this is the degree of randomness of the model's output
                    )
                except Exception as e: 
                    print("Error:",e) 
        return response.choices[0].message["content"]


