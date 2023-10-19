package com.test.vimp;

import java.util.stream.LongStream;

public class FindFactorialUsingJdk8 {

	public static long factorialStreams(long n) {

		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
	}

	public static void main(String[] args) {

		System.out.println(factorialStreams(5));

	}

}
