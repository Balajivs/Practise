
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;



public class Distinct12 {

	public static void main(String[] args) {
		
	List<Integer> list	  =Arrays.asList(21,23,4,5,3,2,4,5);
	
	List<Integer> lst=	 list.stream()
							 .distinct()
							 .collect(Collectors.toList());
	
	System.out.println(lst);
	  
		  
	}
}
