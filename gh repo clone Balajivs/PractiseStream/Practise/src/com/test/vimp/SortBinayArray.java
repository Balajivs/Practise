package com.test.vimp;

public class SortBinayArray {

	    public static void main(String args[]) {
	    	
	           int ar[] = { 1, 0, 1, 0, 0, 1, 0, 1 };
	           System.out.print("Binary array before sorting : ");
	           for (int n : ar)
	                  System.out.print(n);
	           
				/*
				 * for(int i=0;i<=ar.length-1;i++) {
				 * 
				 * System.out.print(" "+ar[i]); }
				 */
	           
	           //i will start from 0.
	           //j will start from end.
	           int i = 0, j = ar.length - 1;
	           
	           //We might face 4 conditions.
	           while (i < j) {
	                  //condition 1 - when a[i] is 1 and a[j] is 0
	                  if (ar[i] > ar[j]) {
	                        ar[i] = 0;
	                        ar[j] = 1;
	                        i++;
	                        j--;
	                  }
	                  //condition 2 - when a[i] is 0 and a[j] is 0
	                  else if (ar[i] == 0 && ar[j] == 0) {
	                        i++;
	                  }
	                  //condition 3 - when a[i] is 1 and a[j] is 1
	                  else if (ar[i] == 1 && ar[j] == 1) {
	                        j--;
	                  }
	                  //condition 4 - when a[i] is 0 and a[j] is 1
	                  else if (ar[i] < ar[j]) {
	                        i++;
	                        j--;
	                  }
	           }
	 
	           System.out.print("\nBinary array after sorting  : ");
	           for (int n : ar)
	                  System.out.print(n);
	 
	    }
	}
  

