package com.test.vimp;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharInString {

	public static void main(String[] args) {

		String str = "delhi is the capital of India";
		
	
		
	Map<String,Long> collect=	Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	
	System.out.println(collect);
	
		
	}

}


// { =5, a=3, c=1, d=2, e=2, f=1, h=2, I=1, i=4, l=2, n=1, o=1, p=1, s=1, t=2}

// 1) first we need to convert into Array [] 
// 2) Once convert into array, we need to convert array to stream use Arrays.stream
// 3) Once convert into stream ready , we need to do the grouping by by each character
//   and assign to map 
// 4) After that use Function.identity() method and Count it using Collectors.counting 

