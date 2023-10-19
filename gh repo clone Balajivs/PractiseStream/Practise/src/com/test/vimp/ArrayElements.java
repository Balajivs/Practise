package com.test.vimp;

import java.util.Arrays;
import java.util.Collections;

public class ArrayElements {
	
	public static void main(String[] args) {
		
		// Approach- 1
		int a[]= {21,34,56,43,56};
		
		System.out.println("Before Sorting "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After Sorting "+Arrays.toString(a));
		System.out.println("---------");
		
		// Approach- 2
		int b[]= {31,23,54,67,35,11};
		System.out.println("Before Sorting "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After Sorting "+Arrays.toString(b));
		System.out.println("---------");
		
		// Array In Reverse Desceding Order
		Integer c[]= {45,65,76,23,12,43,26,18,11,12};   // ReverseOrder method will not support primitive type
		System.out.println("Before Sorting Reverse"+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("After Sorting Reverse "+Arrays.toString(c));
	}

}
