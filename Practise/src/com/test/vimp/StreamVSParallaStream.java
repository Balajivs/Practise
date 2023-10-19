package com.test.vimp;

import java.util.Arrays;
import java.util.List;

public class StreamVSParallaStream {

	
	public static void main(String[] args) {
		
		
		List<String> lst = Arrays.asList("a","b","c","d","e","f");
		lst.stream().forEach(System.out::println);
		
		System.out.println("--------- Parallal Steam ---------");
		
		lst.parallelStream().forEach(System.out::println);
	}
}
