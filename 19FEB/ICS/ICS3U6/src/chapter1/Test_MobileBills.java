package chapter1;

import java.util.Scanner;

public class Test_MobileBills {
	public static void main(String[] args) {
		// Variables and constants
		char planType;
		double costBase = -1;
		double costIncoming = -1;
		double costOutgoing = -1;
		int msgIncoming = -1;
		int msgOutgoing = -1;
		double totalCost = 0;
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Choose a Plan Type: ");
		planType = input.next().charAt(0);
		while (planType != 'A' && planType != 'B' && planType != 'C') {
			System.out.println("No such plan! Try again: ");
			planType = input.next().charAt(0);
		}
		if (planType == 'A') {
			costBase = 0;
			costOutgoing = 0.12;
			costIncoming = 0.10;
		}
		else if (planType == 'B') {
			costBase = 5.00;
			costOutgoing = 0.12; // Subsequent outgoing after first 250
			costIncoming = 0;
		}
		else if (planType == 'C') {
			costBase = 10;
			costOutgoing = 0;
			costIncoming = 0;
		}
		System.out.print("How much texts sent: "); // Enter messaging info
		msgOutgoing = input.nextInt();
		if (planType == 'B') { // For Plan B
			msgOutgoing -= 250;
			if (msgOutgoing < 0)
				msgOutgoing = 0;
		}
		System.out.print("How much texts received:");
		msgIncoming = input.nextInt();
		// Calculation
		totalCost += costBase;
		totalCost += msgOutgoing*costOutgoing;
		totalCost += msgIncoming*costIncoming;
		// Output
		System.out.printf("YOUR MONTHLY BILL IS $%.2f", totalCost);
		
		input.close();
		System.exit(0);
	}
}
