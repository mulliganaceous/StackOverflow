message = input("Enter a message you want to be revealed: ")
secret_string = ""
for char in message:
    secret_string += chr(ord(char) + 128)
print("Revealed", secret_string)
q = input("")
