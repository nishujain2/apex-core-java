package main.java;

import java.util.Scanner;

public class ApexParser {

	public static void main(String[] args) {
		ApexParser apexParser = new ApexParser();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Your string " + input + " isInteger: " + apexParser.isInteger(input));
		if (apexParser.isInteger(input)) {
			System.out.println("Your string " + input + " isOddNumber: " + apexParser.isOddNumber(input));
			System.out.println("Your string " + input + " isEvenNumber: " + apexParser.isEvenNumber(input));
			System.out.println("Your string " + input + " isPrimeNumber: " + apexParser.isPrimeNumber(input));
		}
		scanner.close();
	}
	
	private Boolean isInteger(String str) {
		if (str.isEmpty()) {
			return Boolean.FALSE;
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int a = (int) c;
			if ((a < 48) || (a > 57)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
	
	public Boolean isOddNumber(String str) {
		if (!isInteger(str)) {
			return Boolean.FALSE;
		}
		int a = Integer.parseInt(str);
		if ((a % 2) == 0) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public Boolean isEvenNumber(String str) {
		if (!isInteger(str)) {
			return Boolean.FALSE;
		}
		int a = Integer.parseInt(str);
		if ((a % 2) != 0) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public Boolean isPrimeNumber(String str) {
		if (!isInteger(str)) {
			return Boolean.FALSE;
		}
		int n = Integer.parseInt(str);
		if (n%2 == 0) {
			return Boolean.FALSE;
		}
	    for(int i = 3; i*i < n; i = i + 2) {
	        if(n % i == 0) {
	        	return Boolean.FALSE;
	        }
	    }
	    return Boolean.TRUE;
	}
}
