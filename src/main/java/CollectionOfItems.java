package main.java;

import java.util.Scanner;

public class CollectionOfItems {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of cookies: ");
		int Cookies = scanner.nextInt();
		System.out.print("Number of cake piece: ");
		int Cake = scanner.nextInt();
		int a = 5;			
		int b = 3;
		if (Cookies*a + Cake*b >= 10) {
			System.out.println("Discouted price: $"+ (0.95 * (Cookies*a + Cake*b )));
		} else {
			System.out.println("no discount");
		}
		scanner.close();
	}
}