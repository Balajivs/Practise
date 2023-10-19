package com.test.vimp;

import java.util.Arrays;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,4,5,6,6,7};
		
		int len = arr.length;
		
		System.out.println(" Array "+Arrays.toString(arr));
		
		for (int i = 0; i < len-1; i++) {
			
		  for (int j = i+1; j < len; j++) {
			
			  if(arr[i]==arr[j]) {
				  
				  arr[j]=arr[len-1];
				  len--;
			  }
		}
			
		}
		
		System.out.println(" New array after duplicates remove ");
		
		for (int i = 0; i <len; i++) {
			
			System.out.println( arr[i]);
		}
	}

}
