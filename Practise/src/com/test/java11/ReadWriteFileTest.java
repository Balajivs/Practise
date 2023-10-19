package com.test.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteFileTest {
	
	public static void main(String[] args) throws IOException {
		Path path = Files.createTempFile("temporaryFile", ".txt");
		// Writing to the file
		Files.writeString(path, "Hello World");
		// Reading from the file
		String s = Files.readString(path);
		System.out.print(s);
	}
}