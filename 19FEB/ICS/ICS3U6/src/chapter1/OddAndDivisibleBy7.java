package chapter1;

public class OddAndDivisibleBy7 {
	public static void main (String[] args) {
		// Constants and variables
		final int MAX = 3333;
		int sum = 0;
		// Enumeration
		System.out.println("Sequence of oddd numbers divisible by 7");
		for (int k = 1; k <= MAX; k += 2) {
			if (k % 7 == 0) { // If 7 divides k
				System.out.println(k);
				sum += k;
			}
		}
		System.out.println("The value of the series is " + sum);
		System.exit(0);
	}
}
