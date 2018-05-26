count=1
for dog in  [0,1]:
    for bun in [0,1]:
        for ketchup in [0,1]:
            print ("#",count, "\t")
            print ("dog:%d\tbun:%d\tketchup:%d", % (dog,bun,ketchup))
            count=count+1
