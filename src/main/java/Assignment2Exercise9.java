package main.java;

public class Assignment2Exercise9 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("StringBuilder capacity = " + stringBuilder.capacity());
		System.out.println("StringBuilder size = " + stringBuilder.length());
		System.out.println("StringBuffer capacity = " + stringBuffer.capacity());
		System.out.println("StringBuffer size = " + stringBuffer.length());
		stringBuilder.append("abcdefghijklmnopqrstuvwxyz");
		stringBuffer.append("abcdefghijklmnopqrstuvwxyz");
		System.out.println("Added the 26 character English alphabet to both...");
		System.out.println("StringBuilder capacity = " + stringBuilder.capacity());
		System.out.println("StringBuilder size = " + stringBuilder.length());
		System.out.println("StringBuffer capacity = " + stringBuffer.capacity());
		System.out.println("StringBuffer size = " + stringBuffer.length());
	}
}
