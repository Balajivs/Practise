package com.test.stream;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		long count = strList.stream()
					        .filter(x -> x.isEmpty())
					        .count();
		
		System.out.println(count);

	}
}
