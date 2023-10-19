import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {

	public static void main(String[] args) {
		
		String str = "asdfasdfafk asd234asda";
		char[] arr = str.toCharArray();

		 
	    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	   
	    
	    for (char value: arr) {

			       if (Character.isAlphabetic(value)) {
			    	   
			           if (charMap.containsKey(value)) {
			               charMap.put(value, charMap.get(value) + 1);
		
			           } else {
			               charMap.put(value, 1);
			           }
			       }
	    }

	    System.out.println(charMap);
	}

}
