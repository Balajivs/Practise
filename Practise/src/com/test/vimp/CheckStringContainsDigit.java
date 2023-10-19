package com.test.vimp;

import java.util.regex.*;

public class CheckStringContainsDigit {

	public static boolean onlyDigits(String str) {
		
		// Regex to check string
		// contains only digits
		String regex = "[0-9]+";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		if (str == null) {
			return false;
		}

		Matcher m = p.matcher(str);

		return m.matches();
	}

	public static void main(String args[]) {
		String str = "1234";

		System.out.println(onlyDigits(str));
	}
}
