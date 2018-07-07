package main.java;

import java.util.Scanner;

public class LoopExercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int leftWeight = 0;
		int rightWeight = 0;
		do {
			System.out.print("Enter left side weight = ");
			leftWeight = leftWeight + scanner.nextInt();
			System.out.print("Enter right side weight = ");
			rightWeight = rightWeight + scanner.nextInt();
			if (leftWeight != rightWeight) {
				System.out.println("both are not same weights");	
			}
		} while (leftWeight != rightWeight);
		System.out.println("both are same weights");
		scanner.close();
	}

}
 