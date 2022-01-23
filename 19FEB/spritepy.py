f = open("omg.txt", 'r')

c = f.readlines()
for line in c:
    line = line.rstrip()
    print(f"list[TileElemID.condensedIndex({line:s})] = LoadSprite.convertToSprite(\"\");")
