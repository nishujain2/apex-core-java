package main.java;

public class Squares {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + i*i);
		}
	}

	public int giveInteger() {	
		int a = 4;
		int b =6;
		int c = a+b;
		return c;
	}
	
	public static String giveString() {
		return "nishu";
	}
	
	public Squares() {}
	
	public Squares(int a, int b) {
		System.out.println(a);
	}
}
