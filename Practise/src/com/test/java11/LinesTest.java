package com.test.java11;

import java.util.List;
import java.util.stream.Collectors;

public class LinesTest {

	public static void main(String[] args) {
		String s = "This\n is\n a\n String";

		List<String> listOfLines = s.lines().collect(Collectors.toList());
		System.out.print(listOfLines);
	}
}

//lines() - this method splits a string using line terminators and returns a stream.

