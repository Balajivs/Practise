package com.test.vimp;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str[] = {"Raj","Sri","Durga","Sri","Kamal","Raj","Peter"};
		
		for (int i = 0; i < str.length; i++) {
			
			for (int j = i+1; j < str.length; j++) {
				
				if(str[i].equals(str[j])) {
					
					System.out.println("Duplicate String "+str[i]);
				}
			}
		}
	}
}
