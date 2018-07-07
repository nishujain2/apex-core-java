package main.java;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter integer value for x: ");
		int x = scanner.nextInt();
		System.out.print("Quadratic equation solution = " + (3*x*x - 8*x + 4));
		scanner.close();
	}
}

