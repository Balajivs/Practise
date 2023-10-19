package com.test.vimp;

public class DuplicateEl {

	
	
	public static void duplicateElement() {
		
		int a[] = new int[]{21,33,22,43,55,33,21,54,76,43};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.print("duplicate elements are "+a[j]);
				}
				
			}
			//System.out.println("duplicate elements are "+a[j]);
		}
		
		
	}
	
	
	public static void main(String args[]) {
		
		
		duplicateElement();
	}
}
