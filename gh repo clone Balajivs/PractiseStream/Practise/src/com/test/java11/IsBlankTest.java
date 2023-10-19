package com.test.java11;

public class IsBlankTest {
	
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "    ";
		String s3 = "String";

		System.out.println("s1 is blank: " + s1.isBlank());
		System.out.println("s2 is blank: " + s2.isBlank());
		System.out.print("s3 is blank: " + s3.isBlank());
	}
}