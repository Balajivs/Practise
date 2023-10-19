package com.test.vimp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElemntStartWithOneByJdk8 {

	public static void main(String[] args) {
		
		int numbers[] = {2,3,12,32,15,65,17,43,65,78,19};
		
		List<String> strList =  Arrays.stream(numbers).boxed()
			  .map(s->s + " ")
			  .filter(s->s.startsWith("1"))
			  .collect(Collectors.toList());
		
		System.out.println(strList);
			 
		
	}
}
