package main.java;

import java.util.Scanner;

public class StudentPerformance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total no of students = ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Marks per subject for student " + (i));
			System.out.print("English = ");
			int english = scanner.nextInt();
			System.out.print("Hindi = ");
			int hindi = scanner.nextInt();
			System.out.print("Maths = ");
			int maths = scanner.nextInt();
			System.out.print("Science = ");
			int science = scanner.nextInt();
			System.out.print("Social = ");
			int social = scanner.nextInt();
			System.out.print("Arts = ");
			int arts = scanner.nextInt();
			System.out.println("Total Marks = " + (english+hindi+maths+social+science+arts ));
			System.out.println("Average Marks = " +(english+hindi+maths+social+science+arts ) / 6);
		}
		scanner.close();
	}
}
