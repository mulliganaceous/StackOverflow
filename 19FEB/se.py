first_name = input("What is your first name?:")
print(("Hello, {}").format(first_name))


if first_name == "Craig":
    print(first_name, "is learning Python")
elif first_name == "Maximiliane":
    print(first_name, "is learing with fellow students.   Me too")
else:
    # This is just in case we have a younger user who can't yet read
    age = int(input("How old are you?  "))
    if age <= 6:
        print("Wow you're {}: if you're confident with your reading already.....".format(age))
    print("You should totally learn Python, {0:s}!".format(first_name))
print("Have a great day {0:s}!".format(first_name))
