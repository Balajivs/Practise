import java.util.Arrays;
import java.util.List;

public class StreamEvenNum {

	
	public static void main(String[] args) {
		
		// Even Number
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
              .filter(n -> n%2 == 0)
              .forEach(System.out::println);
        
        System.out.println("------------");
        
        // Start With One
        List<Integer> numList = Arrays.asList(10,15,8,49,25,98,32);
        numList.stream()
              .map(s -> s + "") // Convert integer to String
              .filter(s -> s.startsWith("1"))
              .forEach(System.out::println);
	}
}
