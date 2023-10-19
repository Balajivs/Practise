package com.test.vimp;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	
	public static void main(String args[]) {
		
		
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"apple");
		hm.put(2,"mango");
		hm.put(3,"fasd");
		hm.put(4,"asdf");
		hm.put(2,"shape");
		hm.put(1,"shape");
		hm.put(2,"banana");
		
		
		for(Map.Entry m : hm.entrySet()) {
			
			System.out.println(" KEY  " + m.getKey() + " Val "+ m.getValue());
			
		}
		
		
		
	}
}
