package com.test.intv;

import java.util.Arrays;

public class ZeroShifment {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 0, 5, 0, 6, 0, 5, 0, 9 };

		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]!=0) {
				
				arr[count++] = arr[i];
			}
		}
	
		while(count<arr.length) {
			
			arr[count++] = 0;
		}
		System.out.println(Arrays.toString(arr));
		
	}		
}

