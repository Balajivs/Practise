package com.test.vimp;

public class StringRev {

	
	public static void main(String args[]) {
		
		
		int a[] = new int[] {32,43,54,65,76,32,43};


		for(int i=0;i<a.length;i++){

		   for(int j=i+1;j<a.length;j++){
		   
		     if(a[i]==a[j]) {
		     
		      System.out.println(" duplicate elemts "+a[j]);
		     
		     }
		   
		   }
		}
		
		/*
		 * String st = "Hi how are you"; String strrev = "";
		 * 
		 * for(int i=0;i<=st.length()-1;i++) {
		 * 
		 * strrev = st.charAt(i)+strrev; }
		 * 
		 * System.out.println("reverse string " +strrev);
		 * 
		 * 
		 */
	}
}
