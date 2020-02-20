from datetime import *

char = input("Enter the character you want to use to draw your square: ")
width = int(input("Enter the width of your square: (insert value here): "))
height = int(input("Enter the height of your square: (insert value here): "))

time = datetime.now()
for h in range(0,height):
    print(char * width)
time = datetime.now() - time
time = time.microseconds
print(time)

char = input("Enter the character you want to use to draw your square: ")
width = int(input("Enter the width of your square: (insert value here): "))
height = int(input("Enter the height of your square: (insert value here): "))

time = datetime.now()
print("\n".join([char * width for _ in range(height)]))
time = datetime.now() - time
time = time.microseconds
print(time)
