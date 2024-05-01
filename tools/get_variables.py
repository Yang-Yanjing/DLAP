import os

def getVariable(code:str,operfilepath:str,sensorpath = "./codesensor/CodeSensor.jar")->list:
    
    operfile = os.path.join(operfilepath,"covar.c")
    with open(operfile, 'w') as f:
        f.write(code) 
    astresult = os.path.join(operfilepath,"ast.txt")
    os.system("java -jar "+sensorpath+" {} > {}".format(operfile,astresult))
    # 获得变量名
    variables=[]
    with open(astresult,'r', encoding='latin1') as fp:
        lines = fp.readlines()
        for line in lines:
            oplist = line.split("\t")
            if(oplist[0]=="decl"):
                variables.append(oplist[-1].replace("\n",""))
            if(oplist[0]=="arg"):
                variables.append(oplist[-1].replace("\n",""))
    result = []
    for var in variables:
        if not var.isdigit():
            result.append(var)
    return result
