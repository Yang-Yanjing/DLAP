def calculate_percentage(data):
    count1 = 0
    count2 = 0
    count3 = 0
    count4 = 0
    count5 = 0

    for num in data:
        if num > 0.5:
            count1 += 1
        elif 0.3 <= num <= 0.5:
            count2 += 1
        elif 0.1 <= num < 0.3:
            count3 += 1
        elif 0.05 <= num < 0.1:
            count4 += 1
        else:
            count5 += 1

    total = len(data)
    percentage1 = count1 / total * 100
    percentage2 = count2 / total * 100
    percentage3 = count3 / total * 100
    percentage4 = count4 / total * 100
    percentage5 = count5 / total * 100

    return percentage1, percentage2, percentage3, percentage4, percentage5

def extract_values_by_index(source_list, index_list):
    # 根据索引列表从源列表中提取对应位置的值
    extracted_list = [source_list[i] for i in index_list]
    return extracted_list

import pickle
file = "./FT_android.pkl"



with open(file, "rb") as f:
    data = pickle.load(f)

# print(len(indexlist))
# print(len(data))
# a = input()
# result = extract_values_by_index(data,indexlist)
# print(len(result))

result = data
percentage1, percentage2, percentage3, percentage4, percentage5 = calculate_percentage(result)



print("大于0.5的数据占比：", percentage1)
print("0.3到0.5之间的数据占比：", percentage2)
print("0.1到0.3之间的数据占比：", percentage3)
print("0.05到0.1之间的数据占比：", percentage4)
print("小于0.05的数据占比：", percentage5)

