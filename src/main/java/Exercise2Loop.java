package main.java;

import java.util.Scanner;

public class Exercise2Loop {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("a = ");
		int a = scanner.nextInt();
		System.out.println("b = ");
		int b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			System.out.println(i + " " + i*i);
		}
		scanner.close();
	}
}