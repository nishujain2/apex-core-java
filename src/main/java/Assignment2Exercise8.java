package main.java;

import java.nio.file.Paths;
import java.util.Scanner;

public class Assignment2Exercise8 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(Paths.get("src/main/resources/aTextFile.txt").toFile())) {
			int numberOfA = 0;
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				if (!nextLine.isEmpty()) {
					for (int i = 0; i < nextLine.length(); i++) {
						int asciiValue = (int) nextLine.charAt(i);
						if ((asciiValue == 65) || (asciiValue == 97)) {
							numberOfA++;
						}
					}
				}
			}
			System.out.println("Number of a/A's in the file = " + numberOfA);
		} catch (Exception e) {
			System.out.println("Please make sure the file exists." );
		}
	}
}
