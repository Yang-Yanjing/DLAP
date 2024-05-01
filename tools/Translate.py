import os
import requests
# 配置代理
# YYJtester
def ceshi(a):
    print("~"*80)
    print("数据类型是：",type(a))
    print("数据内容是：")

    print(a)
    try:
        print("数据的大小是：",len(a))
    except:
        print("无法判断数据长度")
    print("~"*80)


def YoudaoTranslate(query):
    results= ""
    query = query.split('. ')
    for i in query:
        url = 'http://fanyi.youdao.com/translate'
        data = {
            "i": i,  # 待翻译的字符串
            "from": "AUTO",
            "to": "AUTO",
            "smartresult": "dict",
            "client": "fanyideskweb",
            "salt": "16081210430989",
            "doctype": "json",
            "version": "2.1",
            "keyfrom": "fanyi.web",
            "action": "FY_BY_CLICKBUTTION"
        }
        res = requests.post(url, data=data).json()
        results += res['translateResult'][0][0]['tgt']
    return results



# text="The function is vulnerable to a CWE-391: Unchecked Error Condition vulnerability. The function throws an exception without checking if the png_ptr parameter is NULL, which can lead to a null pointer dereference and a crash. Additionally, the function does not provide any error handling or recovery mechanism, which can result in unexpected program behavior or security issues."
# a=YoudaoTranslate(text)
# ceshi(a)