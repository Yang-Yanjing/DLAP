import os
import ast
import time
import random as rd
from http import HTTPStatus
import dashscope


# Qwen
class Toyi():
    def __init__(self, model="toyi",temperature=0) -> None:
        self.model = model
        self.temperature = temperature          
    def get_completion(self,prompt):
        messages = [{'role': 'system', 'content': 'You are a helpful assistant.'},
                {'role': 'user', 'content': prompt}]
        try:
            response = dashscope.Generation.call(
                dashscope.Generation.Models.qwen_turbo,
                messages=messages,
                result_format='message',  # set the result to be "message" format.
            )
        except Exception as e:
            try:
                print("Error:",e)
                sleeptime = 2*2
                time.sleep(sleeptime)
                print("Second try, delay{}".format(sleeptime))
                response = dashscope.Generation.call(
                    dashscope.Generation.Models.qwen_turbo,
                    messages=messages,
                    result_format='message',  # set the result to be "message" format.
                )
                
            except Exception as e:
                try:
                    print("Error:",e)
                    sleeptime = 2*2*2
                    time.sleep(sleeptime)
                    print("third try, delay{}".format(sleeptime))
                    response = dashscope.Generation.call(
                        dashscope.Generation.Models.qwen_turbo,
                        messages=messages,
                        result_format='message',  # set the result to be "message" format.
                    )
                except Exception as e:
                    print("Error:",e)
                    sleeptime = 2*2*2*2*2
                    time.sleep(sleeptime)
                    print("final try, delay{}".format(sleeptime))
                    response = dashscope.Generation.call(
                        dashscope.Generation.Models.qwen_turbo,
                        messages=messages,
                        result_format='message',  # set the result to be "message" format.
                    )
        if response.status_code == HTTPStatus.OK: 
            content = response["output"]["choices"][0]["message"]["content"]
            return content
        else:
            print('Request id: %s, Status code: %s, error code: %s, error message: %s' % (
                response.request_id, response.status_code,
                response.code, response.message
            ))
            return "error"



