package main.java;

import java.util.Scanner;

public class TotalSale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter total sales : $");
		double itemCost = sc.nextDouble();
		if (itemCost > 10) {
		System.out.println("5% Discount : $"+ (0.95 * itemCost));
		} else {
			System.out.println("no discount");
		}
		sc.close(); 	
	}
}		
