package com.test.vimp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightOperations {

	public static void main(String args[]) {
		
		
		List<Integer> lst = Arrays.asList(9,4,1,2,4,12,8,14,16,2,18);
		

	// Filter greater than 10 
		
	lst.stream().filter(x->x>10)
				.forEach(p->System.out.println(p));	
	
	
	// Filter greater than 10 and Square Elements 
	lst.stream().filter(x->x>10)
				.map(x->x*x)
				.forEach(p->System.out.println(p));
		
	
	// Create a List of the square of all distinct numbers
	lst.stream().map(i->i*1)
				.distinct()
				.collect(Collectors.toList());


	
	
	}
  
  
	
	
	
  }