package com.test.vimp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateusingJdk8 {

	public static void main(String[] args) {

		List<Integer> numlist = Arrays.asList(10, 20, 20, 24, 24, 27, 26, 27, 29, 30);

		Set<Integer> st = new HashSet<>();

		numlist.stream().filter(n -> !st.add(n)).forEach(System.out::println);

	}
}