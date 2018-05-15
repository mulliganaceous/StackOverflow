array_a = [1,2,3]

array_b = [[2, 4, 8, 16, 32], [3, 9, 27, 81, 243], [4, 16, 64, 256, 1024],
           [5, 25, 125, 625, 3125]]

array_c = []
for ia in range(len(array_a)):
    if ia >= len(array_b):
        array_c.append([array_a[ia], None])
    else:
        for b in array_b[ia]:
            array_c.append([array_a[ia], b])

ia = len(array_a)
while ia < len(array_b):
    for b in array_b[ia]:
        array_c.append([None, b])
    ia += 1

print(array_c)
