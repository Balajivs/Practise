
public class RepeatedChars {

	public static void main(String[] args) {
	      
	        String str ="Hello world";  
	        
	        System.out.println("Repeated characters in the string: ");
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    System.out.println(str.charAt(j));
	                    break;
	                }
	            }
	        }
	    }
}
