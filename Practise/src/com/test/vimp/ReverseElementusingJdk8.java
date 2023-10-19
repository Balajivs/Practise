package com.test.vimp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseElementusingJdk8 {

	public static void main(String[] args) {
		List<Integer> numlist = Arrays.asList(10, 20, 24, 27, 26, 29, 30);
		numlist.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
