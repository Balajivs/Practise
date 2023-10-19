package com.test.vimp;

public class CountSpacesString {

	
	public static void main(String[] args) {
		
		
		int counter=0;
		 String fav="foo hello me hi";
		 for( int i=0; i<fav.length(); i++ ) {
		         if(fav.charAt(i) == ' ' ) {
		             counter++;
		         }
		     }
		 
		 System.out.println(counter);  // Returns 3
		 
		 
		String bar = " ba jfjf jjj j ";
		String[] split = bar.split( " " );
		System.out.println( split.length ); // Returns 5
		
		
		String str = "ram raja rama m ";
		int spaceCount = 0;
	    for (char c : str.toCharArray()) {
	         if (c == ' ') {
	         spaceCount++;
	    }
	  }
		System.out.println(spaceCount); // Return 4
	}
}
