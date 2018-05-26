from random import randrange, uniform

matriz = [[[], []], [[], [], [], [], []]]
turno = [5]
for i in range(1, 2):
    for j in range(1, 5):
        matriz[i][j] = randrange(23)
maior = matriz[1][1]
for i in range(1, 2):
    for j in range(1, 5):
        print (matriz[i][j], maior)
        """if matriz[i][j] > maior:
            maior = matriz[i][j]
            if i == 1:
                turno = "manha"
            elif i == 2:
                turno = "Tarde"""

print("Maior Rendimento: ", maior)
print("Turno: ", turno)
