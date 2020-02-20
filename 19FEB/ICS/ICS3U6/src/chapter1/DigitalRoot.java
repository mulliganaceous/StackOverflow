package chapter1;

public class DigitalRoot {
	public static void main(String[] args) {
		// Constants and Variables
		final long INT = 6765341234134356789L;
		long lastInt = INT;
		int digit;
		int digitalRoot = 0;
		// Evaluation
		while (lastInt / 10 > 0) { // If last integer has multiple digits
			// Find the digital sum of the last integer
			long k = lastInt;
			int subSum = 0;
			while (k > 0) {
				// Extract last digit
				digit = (int) (k % 10);
				subSum += digit;
				// Proceed to next place value
				k /= 10;
			}
			// Set lastInt as the digital sum of the previous integer.
			// Reset the digital sum.
			System.out.printf("Digital sum of %d is %d,%n", lastInt, subSum);
			lastInt = subSum;
		}
		// Digital root is the final term with only one digit
		digitalRoot = (int) lastInt;
		// Output
		System.out.printf("The digital of the digits of %d is %d.", INT, digitalRoot);
		System.exit(0);
	}
}
