package chapter1;

import java.util.Scanner;

public class CoinCalculator {
	public static void main(String[] args) {
		// Variables
		int change;
		int purples = 0;
		int blues = 0;
		int toonies = 0;
		int loonies = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of change received: ");
		change = (int)(input.nextDouble() * 100);
		// Rounding to nearest nickel (All amount exactly in cents)
		int changeRounded = change;
		int roundOff = 0;
		if (changeRounded % 5 <= 2) {
			roundOff = -changeRounded % 5;
			changeRounded += roundOff;
		}
		else if (changeRounded % 5 > 2) {
			roundOff = 5 - (changeRounded % 5);
			changeRounded += roundOff;
		}
		// Coin tally calculation
		int c = changeRounded;
		while (c >= 2000) // If there is enough for the denomination
			c -= 2000;
		while (c >= 1000) {
			c -= 1000;
			purples++;
		}
		while (c >= 500) {
			c -= 500;
			blues++;
		}
		while (c >= 200) {
			c -= 200;
			toonies++;
		}
		while (c >= 100) {
			c -= 100;
			loonies++;
		}
		while (c >= 25) {
			c -= 25;
			quarters++;
		}
		while (c >= 10) {
			c -= 10;
			dimes++;
		}
		while (c >= 5) {
			c -= 5;
			nickels++;
		}
		// Output
		System.out.printf("Change received: $%.2f%n", (double)change/100);
		System.out.printf("Rounded change : $%.2f%n", (double)changeRounded/100);
		System.out.printf("Round-off diff : $%.2f%n", (double)roundOff/100);
		System.out.println("DENOMINATIONS RECEIVED");
		System.out.printf("$10 bills: %d%n", purples);
		System.out.printf("$5  bills: %d%n", blues);
		System.out.printf("Toonies  : %d%n", toonies);
		System.out.printf("Loonies  : %d%n", loonies);
		System.out.printf("Quarters : %d%n", quarters);
		System.out.printf("Dimes    : %d%n", dimes);
		System.out.printf("Nickels  : %d%n", nickels);
		
		input.close();
		System.exit(0);
	}
}
