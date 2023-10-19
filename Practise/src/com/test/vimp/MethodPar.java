package com.test.vimp;

import java.util.Arrays;

public class MethodPar {
	
	public static void main(String args[]) {
		
		String[] stringArray = { "Barbara", "James", "Mary", "John",
			    "Patricia", "Robert", "Michael", "Linda" };
			Arrays.sort(stringArray, String::compareToIgnoreCase);
	}

}
