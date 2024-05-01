'''
Author: Yanjing Yang
Date: 2024-05-01 13:09:55
FilePath: \DLAP\Generpromp.py
Description: Combined Prompts

Copyright (c) 2024 by NJU(Nanjing University), All Rights Reserved. 
'''
class DLprompts:
    def __init__(self):
        pass

    def get_prompts(self, code, SICL:dict, Beacon:dict, COT:list)->str:


        chain = ""
        for i in COT:
            chain+=i
        if Beacon['staticsVul']!='auto_prompts' and Beacon['smallModelVul']>=0.5:
            Template = f"""
There are some vulnerabilities in the code. I need you to act as a vulnerability detection system.the first request is "Help me find the vulnerabilities in the following function fragment limited by triple backticks and analysis it.
```{code}```"
Here is some review chain "{chain}"  to discribe some information for the code.
There is {SICL['confidence']} confidence that it is vulnerable.
then you should follow the review step to make the final answer with reason.
high confidence means that there must exist some vulnerabilities!!!
your final answer must only is one json text string without any reason and anothor texts.
josn format
"label": "1",
"confidence": your final judge according to review chain above,
"vulnerability":only answer yes or no,
"influence Components":answer example (buffer or pointer or something else),
"reason":the reason for answers. """
        
        if Beacon['staticsVul']=='auto_prompts' and Beacon['smallModelVul']<0.5:
            Template = f"""           
I need you to act as a vulnerability detection system.the first request is "Help me find the vulnerabilities in the following function fragment limited by triple backticks and analysis it.
```{code}```"
Here is some review "{chain}" to discribe some information for the code.
There is {SICL['confidence']} confidence that it is vulnerable.
your final answer must only is one json text string without any reason and anothor texts.
josn format
"label": "1",
"confidence": "{SICL['confidence']}",
"vulnerability":only answer yes or no,
"influence Components":answer example (buffer or pointer or something else),
"reason":the reason for answers. """
        else:
            Template = f"""
I need you to act as a vulnerability detection system.the first request is "Help me find the vulnerabilities in the following function fragment limited by triple backticks and analysis it.
```{code}```"
Here is some review "{chain}" to discribe some information for the code.
There is {SICL['confidence']} confidence that it is vulnerable.
then you should follow the review step to make the final answer with reason.
your final answer must only is one json text string without any reason and anothor texts.
josn format
"label": "1",
"confidence": your final confidence review(between 0-1),
"vulnerability":only answer yes or no,
"influence Components":answer example (buffer or pointer or something else),
"reason":the reason for answers. 
            """
        return Template
    
