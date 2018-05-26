class RetailItem:
    def __init__(self, price, units, description): 
        self.price = price
        self.units = units
        self.description = description

    def __str__(self):
        string = str(self.description)
        string += ": $" + str(self.price)
        string += " Units:" + str(self.units)
        return string


class CashRegister:
    def __init__(self):
        self.total_items = ['a'] # Should be a List
        self.total_price = 0; # Missing

    def menu(self):
        print("Welcome to The Toy Store.\n Selection:\n 1.Bunny \n 2.Porcupine \n 3.Duck")
        choice = int(input("What would you like to buy? "))
        if choice==1:
            item = Bunny
        elif choice == 2:
            item = Porcupine
        elif choice==3:
            item = Duck
        else:
            print("Error")

    def purchase(self, item: RetailItem):
        self.total_items.append(item.description)
        self.total_price += item.price
        
    def get_total(self):
        print("Your total items are: ", self.total_items)
        
    def show_items(self):    
        print("Your total price is: ", self.total_price)
        
    def clear_register():
        total_price = []
        total_items = 0

"""Where to initialize RetailItems"""
Duck = RetailItem(6.99, 3, "Large plush duck")
Porcupine = RetailItem(9.99, 5, "Pink plush porcupine")
Bunny = RetailItem(4.99, 7, "small white plush bunny")


C1=CashRegister()
choice=("Options: \n 1.Purchase \n 2.Return to Main Menu")
print(choice)
if choice==1:
    purchase(item)
elif choice==2:
    menu(C1)
