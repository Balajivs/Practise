package com.test.vimp;

public class MaxMinElementArray {

	
	public static void main(String[] args) {
		
		int a[] = {45,32,12,54,76,54,65,72,91};
		
		int max = a[0];  // 45
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {    // 32>45
				
				max= a[i];   // 45
			}
		}
		
		System.out.println("Maximum elements in array is " + max);
		
		
       int min = a[0];  
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {    
				
				min= a[i];  
			}
		}
		System.out.println("Minimum elements in array is " + min);
	}	
}
