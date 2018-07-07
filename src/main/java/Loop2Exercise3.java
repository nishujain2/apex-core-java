package main.java;

import java.util.Scanner;

public class Loop2Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter an integer = ");
		n = scanner.nextInt();
		System.out.print("sum = ");
		int sum = 0;
		for (int i = 1; i<=n; i++){
			System.out.print(i*i); 
			if(i==n){
				System.out.print(" = "); 	
			}else{
				System.out.print("+");
			}
			sum = sum + (i*i);
		}
		System.out.print(sum);
		System.out.println();
		System.out.println("sum = " + n +"("+ n+"+1)("+2*n+"+1)/6 = " + (n*(n+1)*(2*n+1)/6));
		scanner.close();
	}

}
/*
 * Note: do two ways 1^2+2^2+3^2+4^2....n or n(n+1)(2n+1)/6
Enter an integer
3
sum = 1+4+9 = 14
sum = 3(3+1)(6+1)/6 = 14
 */