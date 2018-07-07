package main.java;

import java.util.Scanner;

public class Loop2Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		do {
			int sum = x;
			System.out.print("Please enter an integer = ");
			x = scanner.nextInt();
			if (x != 0) {
				System.out.println(x + sum);
			}
		} while (x != 0);
		scanner.close();
	}

}
 