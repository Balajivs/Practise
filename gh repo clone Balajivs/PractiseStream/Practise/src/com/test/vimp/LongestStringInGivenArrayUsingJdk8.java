package com.test.vimp;

import java.util.Arrays;

public class LongestStringInGivenArrayUsingJdk8 {

	
	public static void main(String[] args) {
		
		String strArr[] = {"delhi" , "is" , "the",  "capital", "of", "India"};
	
		String longestString = Arrays.stream(strArr)
									.reduce((word1,word2)->word1.length() > word2.length() ? word1 : word2)
									.get();
		
		System.out.println(longestString);
		
		
	}
}
