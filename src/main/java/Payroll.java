package main.java;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of hours: ");
		double monthlyHours = scanner.nextDouble();
		System.out.println("Please enter hourly rate: $");
		double ratePerHour = scanner.nextDouble();
		System.out.println("Monthly salary = " + monthlyHours*ratePerHour + " Rate in dollars");
		scanner.close();
	}
}
