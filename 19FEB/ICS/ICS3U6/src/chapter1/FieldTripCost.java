package chapter1;

import java.util.Scanner;

public class FieldTripCost {
	public static void main(String[] args) {
		// Constants
		final double COST_BUS = 158.00;
		final double COST_KM = 3.15;
		final int capacity = 60;
		// Variables;
		String name;
		double km;
		int s;
		int t;
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your destination: ");
		name = input.nextLine();
		System.out.print("Please enter the distance to " + name + "(in km): ");
		km = input.nextDouble();
		System.out.print("Please enter the number of students: ");
		s = input.nextInt();
		System.out.print("Pleast enter the number of teachers: ");
		t = input.nextInt();
		System.out.println("***");
		// Calculation
		int buses = (s + t + capacity - 1) / capacity;
		double costBus = COST_BUS*buses;
		double costDist = 2*COST_KM*km;
		// Output
		System.out.printf("FIELD TRIP EXPENSES: %s%n", name);
		System.out.printf("Distance in km: %.3f%n", km); //Round trip
		System.out.printf("Amount of students/teachers: %d/%d%n", s, t);
		System.out.printf("Number of buses: %d%n", buses);
		System.out.printf("Bus costs: $%.2f%n", costBus);
		System.out.printf("Distance costs: $%.2f%n", costDist);
		System.out.printf("Total cost: $%.2f%n", costBus + costDist);
		
		input.close();
		System.exit(0);
	}
}
