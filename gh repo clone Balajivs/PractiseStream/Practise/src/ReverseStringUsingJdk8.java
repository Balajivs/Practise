import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJdk8 {

	public static void main(String[] args) {

		// First
		String input = "HyderabaD";

		Comparator<String> comparator = (s1, s2) -> -1;
		String reversed = Arrays.stream(input.split("")).sorted(comparator).collect(Collectors.joining());
		System.out.println(reversed);

		// Second
		String str = "INDIA";
		IntStream.range(0, str.length()).forEach(i -> System.out.print(str.charAt(str.length() - 1 - i)));

		// Third
		String s = "Balaji";
		int len = s.length();
		IntStream.range(0, len).map(i -> len - 1 - i).mapToObj(j -> s.charAt(j)).forEach(System.out::print);
	    
	}
}
