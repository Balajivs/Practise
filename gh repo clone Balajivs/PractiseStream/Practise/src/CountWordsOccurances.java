import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.LongAdder;

public class CountWordsOccurances {

	public static void main(String[] args) {

		String sentence = "The cat has black fur and black eyes";

		HashMap<String, LongAdder> wordCount = new LinkedHashMap<>();
		for (String word : sentence.split("\\s")) {

			wordCount.computeIfAbsent(word, (k) -> new LongAdder()).increment();
		}
		System.out.println(wordCount);
	}
}
