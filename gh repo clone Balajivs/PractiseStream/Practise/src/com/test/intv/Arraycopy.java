package com.test.intv;

import java.util.Arrays;

public class Arraycopy {

 public static void main(String[] args) {
	
	 int a[] = {1,2,3,4};
	 int b[] = {5,6,7,8};
	 
	
	 int res[] = new int[a.length + b.length];
	 
	 for(int i=0;i<a.length;i++) {
		 
		 res[i] = a[i];
		 
	 }
	 for(int j=0;j<b.length;j++) {
		 
		 res[a.length+j] = b[j];
	 }
	 
	 System.out.println(Arrays.toString(res));
	 
}


}
