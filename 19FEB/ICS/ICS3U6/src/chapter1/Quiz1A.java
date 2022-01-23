package chapter1;

import java.util.Scanner;

public class Quiz1A {
	public static void main(String[] args) {
		// Variables
		double r;
		double d;
		double A;
		double P;
		final double pi = Math.PI;
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		r = input.nextDouble();
		d = 2*r;
		A = pi*r*r;
		P = 2*pi*r;
		input.close();
		// Output
		System.out.printf("Radius:    %.2f units%n", r);
		System.out.printf("Diameter:  %.2f units%n", d);
		System.out.printf("Area:      %.2f units2%n", A);
		System.out.printf("Perimeter: %.2f units2%n", P);
	}
}
