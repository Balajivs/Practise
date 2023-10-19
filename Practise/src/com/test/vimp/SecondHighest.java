package com.test.vimp;

import java.util.Arrays;

public class SecondHighest {

public static void main(String[] args) {
		
	int a[] = {12,32,10,11,25,26,42};
	
	Arrays.sort(a);
	System.out.println(" "+a);
	System.out.println(" "+a[a.length-2]);	
		
}		
}
