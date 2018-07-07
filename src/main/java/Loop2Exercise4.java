package main.java;

import java.util.Scanner;

public class Loop2Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter number line = ");
		n = scanner.nextInt();
		for (int i = n; i>=1; i--){
			for (int j = i; j>=1; j--){
				System.out.print("*"); 
			}
			System.out.println(); 
		}
		scanner.close();
	}
}
/*
 * display starts7
display the output like
*******
******
*****
****
***
**
*
 */