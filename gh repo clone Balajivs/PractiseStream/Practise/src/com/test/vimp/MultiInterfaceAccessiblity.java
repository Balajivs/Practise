package com.test.vimp;

interface TestInterface1 {
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

//Implementation class code 
class MutliInterfaceAccessiblity implements TestInterface1, TestInterface2 {
	public void show() {
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		MutliInterfaceAccessiblity d = new MutliInterfaceAccessiblity();
		d.show();
	}
}
