import numpy as np
import os
import json

def calculate_cv(data):
    """计算给定数据的变异系数。"""
    data = np.array(data)
    mean = np.mean(data)
    std_dev = np.std(data)
    if mean == 0:
        return float('inf')  # 避免除以零
    return std_dev / mean

# 定义日志文件的路径
base_paths = ["./Linux/GPT/log/result", "./Chrome/GPT/log/result", "./Qemu/GPT/log/result", "./Android/GPT/log/result"]
datasets = ["sysevr", "devign", "linevul"]

# 存储变异系数
cv_results = {}

# 遍历路径和数据集
for base_path in base_paths:
    for dataset in datasets:
        log_file = f"{base_path}_{dataset}"
        file_path = os.path.join(os.getcwd(), log_file)
        distrib = []
        
        # 尝试打开和读取文件
        try:
            with open(file_path, 'r', encoding="utf-8") as file:
                for line in file:
                    if line.startswith("**Beacon**"):
                        DL_str = line.split("**Beacon**_")[1].strip().replace("'", "\"")
                        DL_dict = json.loads(DL_str)
                        judge = DL_dict['smallModelVul']
                        distrib.append(judge)
            
            # 计算当前日志文件的变异系数
            if distrib:
                cv = calculate_cv(distrib)
                cv_results[log_file] = cv
            else:
                cv_results[log_file] = None  # 没有数据的情况
        except FileNotFoundError:
            cv_results[log_file] = None  # 文件不存在

# 打印每个文件的变异系数
for key, value in cv_results.items():
    print(f"{key}: CV = {value}")
