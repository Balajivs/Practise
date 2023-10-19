package com.test.vimp;

// : Factorial of n is the product of all positive descending integers.
// Factorial of n is denoted by n!. For example:

public class Facto {

	
	public static void main(String args[]) {
		
		int number=5, i,fact=1;
		
		for(i=1;i<=number;i++) {
			
			fact = fact * i;
		}
		System.out.println(" 5 facto "+ fact);
	}
}
