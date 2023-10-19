
public class CountWordInSentence {

	public static int countWordsUsingSplit(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] words = input.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {

		String input = "Hello how are you, you are awesome";
		countWordsUsingSplit(input);
	}

}
