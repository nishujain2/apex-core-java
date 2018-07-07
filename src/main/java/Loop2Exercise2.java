package main.java;

import java.util.Scanner;

public class Loop2Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = 0;
		do {
			double sum = x;
			System.out.print("Please enter a number = ");
			x = scanner.nextDouble();
			if (x != 0) {
				System.out.println(x + sum);
			}
		} while (x != 0);
		scanner.close();
	}

}
 