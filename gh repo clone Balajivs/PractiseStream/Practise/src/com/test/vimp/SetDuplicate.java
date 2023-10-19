package com.test.vimp;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicate {
	
	public static void main(String args[]) {
		
		Set<Integer> set = new HashSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(4);
		
		set.forEach(s->System.out.println(s));
		
		// Add Apache Commons Collections Lib
		// For duplicate add 
		 /*   MultiSet<Integer> set = new HashMultiSet<>();
		    set.add(1);
		    set.add(1);
		    set.add(3);
		    set.add(4);
		    set.add(5);
		    set.add(6);
		    set.forEach(s -> System.out.println(s)); */
		
	}

}
