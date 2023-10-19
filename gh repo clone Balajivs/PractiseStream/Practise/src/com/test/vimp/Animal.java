package com.test.vimp;

public class Animal {

	
	public void print() {
		
		System.out.println("from animal");
	}
	
public static void main(String args[]) {
		
		Animal Aobj = new Animal();
		Aobj.print();
		
		Animal Dobj = new Dogs();
		Dobj.print();
		
		Dogs dobj = new Dogs();
		dobj.print();
		
		//Dogs ddoj = new Animal();
		//ddoj.print();
	}
	
}

class Dogs extends Animal{
	
	
	public void print() {
		
		System.out.println("from dogs");
	}
	
	
	
}