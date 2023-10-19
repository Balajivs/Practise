
public class CountVowelAndConsonants {

	private static int vowels = 0;
	private static int consonants = 0;

	public static void countVowelsAndConsonants(String str) {
		
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			}
		}
	}

	public static void main(String[] args) {

		String s = "Delhi is the capital of India";

		countVowelsAndConsonants(s);

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}

}
