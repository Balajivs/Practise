package com.test.vimp;

public class FindDuplicates {

	
	   public static void main(String[] args) {

		      int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};

		      System.out.print("Duplicates elements are ");
		      
		        for(int i=0;i<arr.length;i++){
		            
		          for(int j=i+1;j<arr.length;j++){
		              
		              if(arr[i] == arr[j]){
		                  
		                  System.out.print(arr[j]);
		              }
		          }    
		        }
	    }
}
