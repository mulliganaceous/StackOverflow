import re

k=''
regex = re.compile(r'[a-zA-Z]{2}\d{8}')

with open("omg.txt", 'r') as f:
    for line in f:
        line = line.replace(',', '')
        line = line.replace('.', '')
        k = regex.findall(line)
        #k.append(line)

        position = False        
        if str(k) != '[]':
            position=True
            print(k)
        else:
            position=False
