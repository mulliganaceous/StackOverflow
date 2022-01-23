package chapter1;

import java.util.Scanner;

public class Quiz1B {
	public static void main(String[] args) {
		// Variables
		char stanceA = ' ';
		char stanceB = ' ';
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Select rock, paper, or scissors: (R/P/S) ");
		do {
			stanceA = input.next().charAt(0);
		} while (!(stanceA == 'R' || stanceA == 'P' || stanceA == 'S'));
		input.close();
		// Opponent chooses
		int k = (int) (Math.random()*3);
		if (k == 0)
			stanceB = 'R';
		else if (k == 1)
			stanceB = 'P';
		else if (k == 2)
			stanceB = 'S';
		// Print results
		System.out.printf("Your stance:       %s%n", stanceA);
		System.out.printf("Opponent's stance: %s%n", stanceB);
		// Declare winner
		if (stanceA == stanceB)
			System.out.println("Tie.");
		else if ((stanceA == 'R' && stanceB == 'S') ||
				(stanceA == 'P' && stanceB == 'R') ||
				(stanceA == 'S' && stanceB == 'P'))
				System.out.println("You won!");
		else
			System.out.println("Opponent won!");
	}
}
