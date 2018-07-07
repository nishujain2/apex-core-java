package main.java;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
     	System.out.print("Fibonacci series for n = ");
    	int n = scanner.nextInt();
    	int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(t1);
            if (i != n) {
            	System.out.print(", ");
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        scanner.close();
    }
}