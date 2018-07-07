package main.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Loop2Exercise6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();
		BigInteger factorial = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigInteger(i + ""));
		}
		System.out.println("Factorial(n) = " + factorial.toString());
		scanner.close();
	}
}