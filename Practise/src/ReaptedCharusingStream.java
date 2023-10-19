import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ReaptedCharusingStream {

	    public static void main(String[] args) {
	    	
	    /*    String aa = "India is the best";
	        
	        String[] stringarray = aa.split("");

	       Map<String , Long> map =  Arrays.stream(stringarray)
	        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	    
	        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
	        
	        */
	   
	    		    String s1 = "India is the best";
	    		    int count = 0;
	    		    for (int i = 0; i < s1.length(); i++) {
	    		        for (int j = 0; j < s1.length(); j++) {
	    		        	
	    		            if (s1.charAt(i) == s1.charAt(j)) {
	    		                count++;
	    		            } 
	    		        } 
	    		        System.out.println(s1.charAt(i) + " --> " + count);
	    		        
	    		        String d = String.valueOf(s1.charAt(i)).trim();
	    		        s1 = s1.replaceAll(d, "");
	    		        count = 0;
	    		    }
	    }
	}

