package com.test.vimp;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepatedElementInStringUsingJdk8 {

	public static void main(String[] args) {

		String str = "delhi is the capital of India";

		String firstNonRepeatElemnt = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue() > 1)  
				.findFirst().get().getKey();

		System.out.println(firstNonRepeatElemnt);
	}

}
