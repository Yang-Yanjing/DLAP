import subprocess

def run_cppcheck(file_path):
    # cppcheck命令和参数
    cmd = ['cppcheck', '--enable=warning', '--error-exitcode=1', file_path]

    # 运行cppcheck
    process = subprocess.Popen(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    stdout, stderr = process.communicate()

    # 错误和警告在stderr中，所以我们返回这个
    return stderr.decode()

def parse_cppcheck_output(output):
    # 分割输出为单独的行
    lines = output.split('\n')
    
    # 存储解析的错误和警告
    parsed = []

    # 遍历每一行
    for line in lines:
        # 只保留冒号之后的部分，并去掉多余的空格
        parsed_line = line.split(':', 3)[-1].strip()
        # 只保留error或者warning之后的部分
        if "error:" in parsed_line:
            parsed.append(parsed_line.split("error:")[-1].strip())
        elif "warning:" in parsed_line:
            parsed.append(parsed_line.split("warning:")[-1].strip())

    return parsed

# 使用你的C/C++文件路径来运行cppcheck
file_path = 'covar.c'
errors_and_warnings = run_cppcheck(file_path)

# 解析错误和警告
parsed_errors_and_warnings = parse_cppcheck_output(errors_and_warnings)

# 打印解析后的错误和警告
for message in parsed_errors_and_warnings:
    print(message)