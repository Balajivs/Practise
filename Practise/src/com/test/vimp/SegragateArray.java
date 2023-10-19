package com.test.vimp;

public class SegragateArray {
	 public static void main(String[] args) {
	    int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
	    int start = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 0) {
	            arr[start] = 0;
	            if (i != start) {  // should not override same value with 1
	                arr[i] = 1;
	            }
	            start++;
	        }
	    }

	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	 }
	}