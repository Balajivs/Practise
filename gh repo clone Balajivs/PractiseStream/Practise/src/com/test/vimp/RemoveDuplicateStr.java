package com.test.vimp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateStr {

public static void main(String[] args) {
		
		String str[] = {"Rakesh","Raj","Suresh","Durga","Kamlesh"};
		
		
		    List<String> arList=new ArrayList(Arrays.asList(str));
		    arList.remove(4);
		    arList.remove("Durga");
		     System.out.println(" "+arList);
		
	}
}
