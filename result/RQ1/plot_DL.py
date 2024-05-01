import os
from sklearn.metrics import classification_report, confusion_matrix
import json



dl = "linevul" # "sysevr""devign""linevul"

# pp = "./Linux/GPT/log/result"
pp = "./Chrome/GPT/log/result"
# pp = "./Qemu/GPT/log/result"
# pp = "./Android/GPT/log/result"
log_file = pp+"_"+dl
lab = []
jud = []
file_path = os.path.join(os.getcwd(),log_file)     
distrib = []
with open(file_path, 'r',encoding="utf-8") as file:
    lines = file.readlines()
    foundflag = False
    judgetxt = "" 
    lab_value = -1
    iter = 0
    for line in lines:
        if line.startswith("**GroundTruth**"):
            lab_value = int(line.split("**GroundTruth**_")[1])
            lab.append(lab_value)
        if line.startswith("**Beacon**"):
            DL_str = line.split("**Beacon**_")[1].replace("\n", "").replace("\'", "\"")
            DL_dict = json.loads(DL_str)
            judge = DL_dict['smallModelVul']
            distrib.append(judge)
            if judge>0.5:
                jud.append(1)
            else:
                jud.append(0)

print(distrib) 
      
import matplotlib.pyplot as plt
import matplotlib
import numpy as np
from scipy.stats import gaussian_kde
from matplotlib.colors import LinearSegmentedColormap

# 生成示例数据
data = distrib
plt.subplots_adjust(left=0.1, right=0.9, top=0.9, bottom=0.1)

# 定义颜色映射
colors = ["#FEF1BD","#d6e0d4", "#ADCDEA"]
colors_r =  colors[::-1] # 举例，实际可以根据需要调整
n_bins = 500  # 颜色分级数量
cmap = LinearSegmentedColormap.from_list("mycmap", colors_r, N=n_bins)

# 计算核密度估计
kde = gaussian_kde(data)

# 创建平滑的 x 值范围
x = np.linspace(0, 1, 10000)

# 创建新的图形和坐标轴
fig, ax = plt.subplots()

# 绘制核密度估计曲线
y = kde(x)
ax.plot(x, y, color='grey')

# 使用颜色映射填充曲线下方的区域
for i in range(len(x) - 1):
    xs = [x[i], x[i+1], x[i+1], x[i]]
    ys = [0, 0, y[i], y[i+1]]
    ax.fill(xs, ys, color=cmap(y[i] / y.max()), alpha=0.5)  # alpha 值设置为 0.5


# 设置纵轴范围从0开始
ax.set_ylim(bottom=0)
ax.set_xlim(0.0, 1)

# 添加颜色条
sm = plt.cm.ScalarMappable(cmap=cmap, norm=plt.Normalize(0, max(y)))
plt.colorbar(sm, ax=ax)

# 设置x轴刻度
xticks = np.linspace(0.0, 1, 6)
ax.set_xticks(xticks)
ax.set_xticklabels(['{:.1f}'.format(xtick) for xtick in xticks])

# 设置y轴刻度
yticks = np.linspace(0, max(y), 6)
ax.set_yticks(yticks)
ax.set_yticklabels(['{:.2f}'.format(ytick) for ytick in yticks])

# 标记x轴和y轴
ax.set_xlabel('Interval', fontsize=16)
ax.set_ylabel('Probability Density Function', fontsize=16)


# 显示图形
# plt.show()
plt.savefig('density_plot_{}.png'.format(dl), bbox_inches='tight', pad_inches=0.1)



