package m2APR;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
	private static int Str, Dex, Con, Int, Wis, Cha;
	static Scanner sc = new Scanner(System.in);

	public static Integer[] methodOne() {
		ArrayList<Integer> stats = new ArrayList<Integer>();
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Str : ");
		Str = sc.nextInt();
		while (Str < 0) {
			System.err.println("Invalid Input!!");
			Str = sc.nextInt();
		}
		
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Dex : ");
		Dex = sc.nextInt();
		while (Dex < 0) {
			System.err.println("Invalid Input!!");
			Dex = sc.nextInt();
		}
		
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Con : ");
		Con = sc.nextInt();
		while (Con < 0) {
			System.err.println("Invalid Input!!");
			Con = sc.nextInt();
		}
		
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Int : "); 
		Int = sc.nextInt();
		while (Int < 0) {
			System.err.println("Invalid Input!!");
			Int = sc.nextInt();
		}
		
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Wis : ");
		Wis = sc.nextInt();
		while (Wis < 0) {
			System.err.println("Invalid Input!!");
			Wis = sc.nextInt();
		}
		
		// Entering an integer by the user,
		// checking the validity and exiting
		// from the game if invalid
		System.out.print("Enter Cha : ");
		Cha = sc.nextInt();
		while (Cha < 0) {
			System.err.println("Invalid Input!!");
			Cha = sc.nextInt();
		}

		Integer statsValue[] = stats.toArray(new Integer[0]);
		return statsValue;
	}
	
	public static int methodTwo() {
		final int DICES = 4;
		int[] diceroll = new int[DICES];
		diceroll[0] = (int) (Math.random() * 1000 % 6 + 1);
	    diceroll[1] = (int) (Math.random() * 1000 % 6 + 1);
		diceroll[2] = (int) (Math.random() * 1000 % 6 + 1);
		diceroll[3] = (int) (Math.random() * 1000 % 6 + 1);
		int total = diceroll[0] + diceroll[1] + diceroll[2] + diceroll[3];
		System.out.printf("%d %d %d %d\n", diceroll[0], diceroll[1], diceroll[2], diceroll[3]);
		
		// finding the lowest amount
		int min = diceroll[0];
		for (int k = 0; k < DICES; k++) {
			if (diceroll[k] < min)
				min = diceroll[k];
		}
		total -= min;
		
		// Assume the attribute is the total
		// if total discarding min is greater than 16, roll an additional dice
		if (total > 16) {
			total += (int) (Math.random() * 1000 % 6 + 1);
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		int k = Method.methodTwo();
		System.out.println(k);
	}
}