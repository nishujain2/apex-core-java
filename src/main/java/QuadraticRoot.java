package main.java;

import java.util.Scanner;

public class QuadraticRoot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		System.out.print("c = ");
		int c = scanner.nextInt();
		if ((b * b) - (4*a*c) >= 0) {
			System.out.println("Root 1 = " + ((-b + Math.sqrt((b*b) - (4*a*c))) / (2*a)));
			System.out.println("Root 2 = " + ((-b - Math.sqrt((b*b) - (4*a*c))) / (2*a)));
		} else {
			System.out.println("no roots");
		}
		scanner.close();
	}	
}

