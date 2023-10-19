import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String args[]) {
		
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,12,23,34,15,49,25);

        // Sorted 
        myList.stream().sorted().forEach(System.out::println);
        
        System.out.println("-----Start With 1-----------");
        myList.stream()
              .map(s -> s + "") // Convert integer to String
              .filter(s -> s.startsWith("1"))
              .forEach(System.out::println);
        
        System.out.println("-----First Element-----------");
        // Find First Elements 
        myList.stream()
        	  .findFirst()
        	  .ifPresent(System.out::println);
        
        System.out.println("------Duplicate Remove----------");	
       // Duplicate Elements 
        myList.stream()
        	  .collect(Collectors.toSet())
        	  .forEach(System.out::println);
       
        System.out.println("-----Reverse Order----------"); 
      // Descending Order
         myList.stream()
        	   .sorted(Collections.reverseOrder())
        	   .forEach(System.out::println);
         
         System.out.println("-----Greate than 25 ----------");   
       // Greter than 25
       myList.stream()
       		  .filter(x->x>25).forEach(System.out::println);
        	
        	
    }
}
