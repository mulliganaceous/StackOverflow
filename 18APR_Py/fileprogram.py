import random
f = open("file.txt", "r")
alist = f.readlines()
print(alist)
f.close()

anotherlist = ['word1', 'word2']
astring = random.choice(alist).strip() + "\n" + random.choice(anotherlist)
print(astring)
