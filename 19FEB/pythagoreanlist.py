def pythagorean(numberset: list):
    sol = []
    for ci in range(0, len(numberset)):
        for ai in range(0, len(numberset)):
            for bi in range(ai, len(numberset)):
                a,b,c = numberset[ai], numberset[bi], numberset[ci]
                if a*a + b*b == c*c:
                    sol.append((a, b, c))
    return sol

def quicksort(numberset: list):
    pass

def pythagoreans(numberset: list):
    pass

numberset = [5,9,3,8,4,7,11,18,21,10,6,13,12]
sol = pythagorean(numberset)
numberset = quicksort(numberset)
