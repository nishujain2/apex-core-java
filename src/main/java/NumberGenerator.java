package main.java;

public class NumberGenerator {

	public static void main(String[] args) {
		NumberGenerator numberGenerator = new NumberGenerator(); 
		System.out.print("Thousand numbers: ");
		numberGenerator.generateThousandNumbers();
		System.out.print("\nMultiples of 5: ");
		numberGenerator.generateMultipleOfFive();
		System.out.print("\nOdd numbers: ");
		numberGenerator.generateOddNumbers();
	}
	
	public void generateThousandNumbers() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i);
			if (i != 1000) {
				System.out.print(", ");
			}
		}
	}
	
	public void generateMultipleOfFive() {
		for (int i = 5; i < 1000; i = i + 5) {
			System.out.print(i);
			if (i != 995) {
				System.out.print(", ");
			}
		}
	}
	
	public void generateOddNumbers() {
		for (int i = 1; i <= 999; i = i + 2) {
			System.out.print(i);
			if (i != 999) {
				System.out.print(", ");
			}
		}
	}
}
