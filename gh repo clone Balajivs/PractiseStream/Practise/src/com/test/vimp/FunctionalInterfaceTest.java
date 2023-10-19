package com.test.vimp;

@FunctionalInterface
interface AdditionInterface {

	Integer add(int a, int b);

}

@FunctionalInterface
interface MultiplyInterface {

	Integer multiply(int x, int y);

}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		AdditionInterface addinterface = (a, b) -> a + b;

		System.out.println("Addition  " + addinterface.add(10, 90));

		MultiplyInterface mul = (x, y) -> x * y;

		System.out.println("Multiplication " + mul.multiply(2, 5));

	}

}
