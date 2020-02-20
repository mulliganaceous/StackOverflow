package chapter1;

import java.util.Scanner;

/**Calculates the pay with overtime for each employee.
 * Also finds the employee with the highest pay.
 * @author !MULLIGANACEOUS!
 * @version ICS3U6
 */
public class Test_EmployeeInformation {
	public static void main(String[] args) {
		// Statistical variables
		double highestPay = 0;
		String highestName = "None!";
		char moreEmployees;
		int numOfEmployees = 0;
		// Employee variables
		String name;
		double rate;
		double hours;
		double ot;
		double payroll;
		final double OTThreshold = 40;
		final double OTMultiplier = 1.5;
		
		// Input (do-while)
		Scanner input = new Scanner(System.in);
		do {
			numOfEmployees++;
			// Ask for name, pay rate, and hours worked
			System.out.print("Enter the name of the employee: ");
			name = input.nextLine();
			System.out.print("Enter the pay rate for " + name + " ($/h): ");
			rate = input.nextDouble();
			System.out.print("Enter the total hours worked for " + name + " (h): ");
			hours = input.nextDouble();
			// Calculation and results
			payroll = 0;
			if (hours > OTThreshold) {
				payroll += OTThreshold*rate;
				ot = hours - OTThreshold;
				payroll += OTMultiplier*ot*rate;
				System.out.printf("%s has %.2f overtime hours%n", name, ot);
			}
			else {
				ot = 0;
				payroll = hours*rate;
			}
			System.out.printf("The payroll for %s is $%.2f%n", name, payroll);
			System.out.printf("*****%n%n");
			// Track records
			if (payroll > highestPay) {
				highestPay = payroll;
				highestName = name;
			}
			// Ask if there are more employees
			do {
				System.out.println("Are there more employees: ");
				moreEmployees = input.next().charAt(0);
				input.nextLine();
			} while (moreEmployees != 'N' && moreEmployees != 'Y');
		} while (moreEmployees == 'Y');
		
		input.close();
		// Output
		System.out.printf("Number of Employees: %d%n", numOfEmployees);
		if (numOfEmployees > 3) {
			System.out.printf("%s has the highest payroll at $%.2f%n", 
					highestName, highestPay);
		}
		System.out.println("Thank you for using the Payroll Program!");
		System.exit(0);
	}
}
