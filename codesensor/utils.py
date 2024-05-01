import os
import subprocess

# 将输入的代码保存到txt文件中
def save_code_to_txt(code, file_path):
    with open(file_path, 'w') as txt_file:
        txt_file.write(code)

# 对c源代码进行修改，在最后的}前加入换行
def modify_c_file(c_file_path):
    with open(c_file_path, 'r') as c_file:
        content = c_file.read()

    last_brace_index = content.rfind("}")

    if last_brace_index != -1:
        modified_content = content[:last_brace_index] + "\n" + content[last_brace_index:]
        
        with open(c_file_path, 'w') as c_file:
            c_file.write(modified_content)

# 将txt转化为ast
def generate_ast(c_file, txt_file):
    cmd = f"java -jar ./codesensor/CodeSensor.jar {c_file} > {txt_file}"
    
    result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
    
    if "mismatched character '<EOF>'" in result.stderr:
        modify_c_file(c_file)
        # print("Modified and generating AST for:", c_file)
        os.system(cmd)

# 删除指定文件
def delete_file(file_path):
    if os.path.exists(file_path):
        os.remove(file_path)
        # print(f"File {file_path} has been deleted.")
    
# 判断转化为的ast是否为函数
def check_ast_for_func(code):
    tmp_file = './tmp/debian.txt'
    ast_file = './tmp/debian_ast.txt'
    
    save_code_to_txt(code, tmp_file)
    generate_ast(tmp_file, ast_file)
    
    with open(ast_file, 'r') as ast:
        first_line = ast.readline()
        
    delete_file(tmp_file)
    delete_file(ast_file)
    
    return "func" in first_line