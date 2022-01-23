package chapter1;

public class Test_ProductOfOddDigits {
	public static void main(String[] args) {
		// Inputted variables
		final int INTEGER = 2147483647;
		// Initial values
		int productDigits = 1;
		int n = INTEGER;
		int digit;
		int numOfOddDigits = 0;
		// Loop until greatest digit
		while (n > 0) {
			digit = n % 10;
			if (digit % 2 == 1) { // If odd
				productDigits *= digit;
				numOfOddDigits++;
			}
			// Advance to next digit
			n /= 10;
		}
		// Output
		if (numOfOddDigits <= 0)
			System.out.printf("No odd digits!");
		else
			System.out.printf("The products of the odd digits of %d is %d.",
				INTEGER, productDigits);
		System.exit(0);
	}
}
