import openai 
import os
import ast
import time
import random as rd


class Vicuna():
    def __init__(self, model="vicuna-13b-16k",temperature=0) -> None:
        self.model = model
        self.temperature = temperature          
    def get_completion(self,prompt):
        openai.api_base = "http://10.58.0.2:8185/v1"
        messages = [{"role": "user", "content": prompt}]
        try:
            response = openai.ChatCompletion.create(
                model=self.model,
                messages=messages,
                temperature=self.temperature, # this is the degree of randomness of the model's output
            )
        except Exception as e:
            try:
                print("Error:",e)
                sleeptime = 2*2
                time.sleep(sleeptime)
                print("Second try, delay{}".format(sleeptime))
                response = openai.ChatCompletion.create(
                model=self.model,
                messages=messages,
                temperature=self.temperature, # this is the degree of randomness of the model's output
                )
            except Exception as e:
                try:
                    print("Error:",e)
                    sleeptime = 2*2*2
                    time.sleep(sleeptime)
                    print("third try, delay{}".format(sleeptime))
                    response = openai.ChatCompletion.create(
                    model=self.model,
                    messages=messages,
                    temperature=self.temperature, # this is the degree of randomness of the model's output
                    )
                except Exception as e:
                    print("Error:",e)
                    sleeptime = 2*2*2*2*2
                    time.sleep(sleeptime)
                    print("final try, delay{}".format(sleeptime))
                    response = openai.ChatCompletion.create(
                        model=self.model,
                        messages=messages,
                        temperature=self.temperature, # this is the degree of randomness of the model's output
                    ) 
        return response.choices[0].message["content"]



