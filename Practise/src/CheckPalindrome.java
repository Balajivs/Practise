
public class CheckPalindrome {

	
	public static boolean isPalindrome(String str) {
		
		String s="";
		
		for(int i= s.length()-1;i>=0;i++) {
			
			s = str.charAt(i) + s;
		}
		
		return str.equals(s);
	}
	public static void main(String[] args) {
		
		String input="madam";
		System.out.println("Madam is Palindrome " +isPalindrome(input));
	}
}
