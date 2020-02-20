package chapter1;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		// Constants and variables
		final int MIN = 0;
		final int MAX = 1000;
		int sum = 0;
		// For loop
		for (int k = MIN; k <= MAX; k++) {
			if (k % 2 == 1) // For odd k
				sum += k;
		}
		// Output
		System.out.printf("The sum of odd numbers between [%d,%d] is %d.%n",
		MIN, MAX, sum);
		System.exit(0);
	}
}
