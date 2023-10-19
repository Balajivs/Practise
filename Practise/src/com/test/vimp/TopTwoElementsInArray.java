package com.test.vimp;

import java.util.Arrays;

public class TopTwoElementsInArray {
	
	public static void main(String[] args) {
		
		int a[] = {32,43,4,12,45,67,78,98,76,54,99};
		
		int[] sortedArray= TopTwoElementsInArray.getTopTwoElements(a);
		
		System.out.println(" Top First Elements is "+a[0]);
		System.out.println(" Top Second Elements is "+a[1]);
		
	}
	
	public static int[] getTopTwoElements(int[] a) {
	
		int[] input = a;
		int temp;
		System.out.println(" Elements "+Arrays.toString(a));
		
		for (int i = 0; i < input.length; i++) {
			
			for (int j = 0; j < input.length; j++) {
				
				
				if(input[i]>input[j]) {
					temp = input[i];
					input[i]=input[j];
					input[j] = temp;
				}
				
			}
		}		
		return input;
		
	}
}
