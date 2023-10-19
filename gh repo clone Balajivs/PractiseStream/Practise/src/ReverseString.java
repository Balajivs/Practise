
public class ReverseString {

	public static void main(String[] args) {

		String str = "Raja Rama";

		String strrev = "";

		for (int i = 0; i < str.length(); i++) {

			strrev = str.charAt(i) + strrev;

		}

		System.out.println(" " + strrev);

	}

}
