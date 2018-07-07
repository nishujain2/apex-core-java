package main.java;

import java.util.Scanner;

public class BasicCalculatorClient {
	
	public static void main(String[] args) {
		BasicCalculator basicCalculator = new BasicCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a  = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b  = scanner.nextInt();
		System.out.println("Addition = " + basicCalculator.addition(a, b));
		System.out.println("Subtraction = " + basicCalculator.subtraction(a, b));
		System.out.println("Multiplication = " + basicCalculator.multiplication(a, b));
		System.out.println("Division = " + basicCalculator.division(a, b));
		Employee employee = new Employee();
		System.out.println("Address: ");
		String address = scanner.nextLine();
		employee.setAddress(address);
		
		scanner.close();
		
		
		
	}
}
 