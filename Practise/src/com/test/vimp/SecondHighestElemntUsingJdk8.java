package com.test.vimp;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElemntUsingJdk8 {

	
	public static void main(String[] args) {
	
		
		int numbers[] = {12,32,43,64,74,43,89};
		
		Integer secondHighNum = Arrays.stream(numbers).boxed()
		       .sorted(Comparator.reverseOrder())
		       .skip(1)
		       .findFirst().get();
		
		System.out.println(secondHighNum);
	}
	
}
