package m2MAY;

import java.util.ArrayList;

public class ShoppingCart {
	abstract class Perishable {
		private int brandName;
		private int manufacturer;
		private int unitprice;
	}
	
	public static void main(String args[]) {// main method
		ArrayList<Perishable> perishables = new ArrayList<Perishable>();
		ArrayList<NonPerishable> nonPerishables = new ArrayList<NonPerishable>();

		Cereal cereal = new Cereal();
		cereal.setBrandName("Kellogs");
		cereal.setManufacturer("Sereal Manufacturing Co.");
		cereal.setUnitPrice(12.79);
		// nonPerishables.add(cereal);//need to use sortItems method according to the
		// instruction

		CannedSoup soup = new CannedSoup();
		soup.setSoupMaker("TastySoups Co.");
		soup.setDescription("Mushroom soup with natural flavors...");
		soup.setUnitPrice(2.39);
		// nonPerishables.add(soup); //need to use sortItems method according to the
		// instruction

		Meat meat = new Meat();
		meat.setWeightInPounds(1.29);
		meat.setDescription("T-Bone Steak");
		meat.setPricePerPound(10.89);
		// perishables.add(meat); //need to use sortItems method according to the
		// instruction

		Fruit fruit = new Fruit();
		fruit.setDescription("Bananas imported from Brazil.");
		fruit.setPricePerBag(6.99);
		// perishables.add(fruit); //need to use sortItems method according to the
		// instruction

		System.out.println("Price of " + meat.getDescription() + " is:" + meat.getTotalPrice());
		System.out.println("Price of " + fruit.getDescription() + " is:" + fruit.getTotalPrice());

		sortItems(cereal);// adding the object to list through this method
		sortItems(soup);
		sortItems(meat);
		sortItems(fruit);

		displayItems();// print all the items

	}

	/*
	 * sortItems: This function will be to take the item passed in and sort and add
	 * the item into one of the of Perishable or NonPerishable ArrayList. Use
	 * casting and/or the instanceof keyword to determine which list the item should
	 * be added to. I dont know what did they mean by sort items...
	 */
	static void sortItems(GroceryItem item) {// This method needs to take
		if (item instanceof Perishable)
			perishables.add(item);// error here because I dont have access to arraylist

		if (item instanceof NonPerishable)
			nonPerishables.add(item);// error here because I dont have access to arraylist
	}

	static void displayItems() {// display all the items from arraylist
		// if(item instanceof Perishable)

		System.out.println("Here is the list of your Shopping Cart:\n--------------------------");
		System.out.println("Perishables:\n----");

		for (Perishable item : perishables) // print all the perishables-How can I acces to arraylist in main method
			System.out.println(item.getDescription() + ", total price:" + item.getTotalPrice());

		System.out.println("NonPerishables:\n----");

		for (NonPerishable item : nonPerishables) {// how do I access to array list at main method
			if (item.getSoupMaker)// how do I check if it is soup or not without adding extra method to class
				System.out.println(item.getDescription + " " + item.getSoupMaker() + ", unitPrice:"
						+ item.getUnitPrice() + " totalPrice:" + item.getTotalPrice());
			else// if it is not soup it should be cereal
				System.out.println(item.getBrand() + " " + item.getManufacturer() + ", unitPrice:" + item.getUnitPrice()
						+ " totalPrice:" + item.getTotalPrice());
		}
	}
}
