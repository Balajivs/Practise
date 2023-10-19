package com.test.vimp;

import java.util.HashSet;
import java.util.Set;

public class Dulicates {

public static void main(String[] args) {
		
		String str[] = {"Rakesh","Raj","Suresh","Durga","Mahesh","Raj","Mahesh"};
		
		
		Set<String> st = new HashSet<String>();
		
		for(String s : str) {
			
			if(st.add(s)==false) {
				
				System.out.println("Duplicate String are "+s);
			}
		}
	}
}
