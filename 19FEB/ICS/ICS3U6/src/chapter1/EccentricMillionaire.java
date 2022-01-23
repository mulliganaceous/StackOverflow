package chapter1;

import java.util.Scanner;

public class EccentricMillionaire {
	public static void main(String[] args) {
		System.out.println("An eccentric millionaire tells you that she will give you");
		System.out.println("one cent on the first day, 2¢ on the second day, 4¢ on the third day,");
		System.out.println("and so on. As each day passes, the amount she gives you doubles each time.");
		System.out.println();
		// Variables ($)
		final double INIValue = 0.01;
		final double k = 2;
		int days = 0;
		double currentValue = INIValue;
		double totalValue = 0;
		double target; //
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("What is the minimum amount of money that you want to accumulate($)? ");
		target = input.nextDouble();
		input.close();
		// Sum up money
		while (totalValue < target) {
			days++;
			totalValue += currentValue;
			// Prepare for next iteration
			currentValue *= k;
		}
		// Output
		System.out.printf("Ït takes %d days to accumulate at least $%.2f%n", days, target);
		System.out.printf("After %d days, you have accumulated $%.2f%n", days, totalValue);
		System.exit(0);
	}
}
