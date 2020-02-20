package chapter1;

public class EuclidGCM {
	static final int A = 378;
	static final int B = 924;
	public static void main(String[] args) {
		// Variables
		int a = A;
		int b = B;
		int r = a % b;
		// Euclid's method
		while (r != 0) {
			System.out.printf("a: %d b: %d r:%d%n",a,b,r);
			a = b;
			b = r;
			r = a % b;
		}
		// Print result
		System.out.printf("GCD of (%d,%d) is %d", A, B, b);
	}
}
