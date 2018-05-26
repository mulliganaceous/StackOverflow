read = open('file.txt', 'r+')

intent = 0

for line in read:
    print("LOOP")
    if '{' in line:
        intent += 1
        #print intent, ", up"
    if '}' in line:
        #intent -= 1
        print (intent, ", down") # EDIT
    if "    " in line:
        print ("tab") # EDIT
