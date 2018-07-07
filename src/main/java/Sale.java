package main.java;

import java.util.Scanner;

public class Sale {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter item cost : $");
		double itemCost = scanner.nextDouble();
		System.out.println("5% Discount : $"+ (0.05 * itemCost));
		Double discountValue = (0.05 * itemCost);
		System.out.println("Amount to be paid : $ " + (itemCost - discountValue));
		scanner.close();
	}
}
