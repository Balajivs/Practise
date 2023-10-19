package com.test.vimp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElemntInStringByJdk8 {

	public static void main(String[] args) {
		
		String str = "delhi is the capital of India";
		
	List<String>	collect=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		    .entrySet()
		    .stream()
		    .filter(x->x.getValue()>=1)
		    .map(Map.Entry::getKey)
		    .collect(Collectors.toList());
	
		
		
		
		System.out.println(collect);
		
		
	}
}
