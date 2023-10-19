package com.test.vimp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElusingStream {

	public static void main(String args[]) {

		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 1, 3, 4, 4 });

		//numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1).collect(Collectors.toSet())
		//		.forEach(System.out::println);
		
		Set<Integer> set = new HashSet<>();
		
		for(Integer num : numbers) {
			
			if(set.add(num)==false) {
				
				System.out.println("duplicate number "+num);
			}
			
		}
	}
}