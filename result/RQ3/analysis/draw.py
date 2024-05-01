import matplotlib.pyplot as plt
import numpy as np

categories = ['>0.5', '0.3-0.5', '0.1-0.3', '0.05-0.1', '<0.05']
FTchrome = [74.1042345276873, 6.026058631921824, 6.188925081433225, 1.9543973941368076, 11.726384364820847]
FTandroid = [77.4527687363192, 2.192182425081, 6.188925081433225, 1.814332251433, 21.3821138211814]
FTlinux = [52.24913494809689, 10.380622837370241, 8.996539792387544, 2.0761245674740483, 26.297577854671278]
FTqemu = [1.178861, 2.111111231123, 3.0222835081433, 1.1382182425, 93.5143687363]
DLAPchrome = [86.1788617886179, 1.3647886179, 1.256692837, 1.11324792387, 13.821138211382115]
DLAPandroid = [83.6272040302267, 1, 1.770780856423174, 1, 13.602015113350127]
DLAPlinux = [76.38888888888889, 1, 0, 1, 23.61111111111111]
DLAPqemu = [55.172413793103445, 0, 1, 0, 44.827586206896555]

values1 = FTlinux
values2 = DLAPlinux
x = np.arange(len(categories))
width = 0.35
gap = 0.05  # 柱子之间的间隔

fig, ax = plt.subplots()
cmap = plt.get_cmap('bwr')  # 使用'bwr' colormap
rects1 = ax.bar(x - width/2 - gap/2, values1, width, label='Fine-tuning', color="#FEF1BD",edgecolor='black', linewidth=1)  # 使用colormap的对应颜色
rects2 = ax.bar(x + width/2 + gap/2, values2, width, label='DLAP', color="#ADCDEA",edgecolor='black', linewidth=1)  # 使用colormap的对应颜色

# Hide x-axis tick labels
ax.set_xticks([])

# Increase y-axis tick label font size
ax.tick_params(axis='y', labelsize=16)

fig.tight_layout()

plt.savefig('bar_chart.png')  # 保存为PNG文件
print("柱状图已保存为bar_chart.png")