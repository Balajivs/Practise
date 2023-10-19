package com.test.java11;

public class StripTest {

	public static void main(String[] args) {
		String s = "  string  ";
		System.out.println("$" + s + "$");
		System.out.println("$" + s.strip() + "$");
		System.out.println("$" + s.stripLeading() + "$");  
		System.out.println("$" + s.stripTrailing() + "$");
	}
}


// stripLeading(): It is used to remove the white space which is in front of the string
// stripTrailing(): It is used to remove the white space which is in the back of the string
// strip(): It is used to remove the white spaces which are in front and back of the string
// They are very similar to the existing trim() method, but provide Unicode support.