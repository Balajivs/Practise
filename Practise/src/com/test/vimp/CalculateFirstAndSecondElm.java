package com.test.vimp;

public class CalculateFirstAndSecondElm {

	
	public static void main(String[] args) {

	    int[] array = {1, 3, 6, 4, 1, 8};
	    
	    for(int i = 0; i < array.length / 2; i++) 
	    {  
	        int firstNumber = array[i];
	        int secondNumber = array[array.length - 1 - i];
	        
	        //System.out.println("second "+ secondNumber);
	        
	        int sum = firstNumber + secondNumber;
	        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
	    }  
}
}
