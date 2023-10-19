package com.test.vimp;

public class LargeElementUsingJdk8 {
	
	
	public static void main(String[] args) {

		
		int arry[] = {98, 34, 72, 50, 88};
		int max = arry[0];
		for (int i = 0; i < arry.length; i++) {
		  if (arry[i] > max)
		    max = arry[i];
		}
		System.out.println("Largest element is: " + max);
	}
}
