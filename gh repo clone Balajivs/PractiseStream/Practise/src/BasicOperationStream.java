import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BasicOperationStream {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 3, 4, 5, 6, 12, 14, 15, 16);

		// Filter Grater Than 10
		numList.stream().filter(x -> x > 10).forEach(p -> System.out.println(p));

		// Squre Elements
		numList.stream().map(x -> x * x).forEach(p -> System.out.println(p));

		// Squre distinct element
		List<Integer> distinctElmntSqure = numList.stream()
												  .map(i -> i * i).distinct()
												  .collect(Collectors.toList());

		System.out.println(distinctElmntSqure);

		// Get count, min, max, sum, and the average for numbers

		IntSummaryStatistics stats = numList.stream()
											.mapToInt((x) -> x).summaryStatistics();
		System.out.println("Get count, min, max, sum, and the average for numbers "+ stats);

		// Count the number of String that start with a
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream()
							.filter(x -> x.startsWith("a")).count();
		System.out.println("Start with A count is " + count);

		// Remove all empty Strings from List
		List<String> filtered = strList.stream()
									   .filter(x -> !x.isEmpty())
									   .collect(Collectors.toList());
		System.out.println("Removed All Empty String " + filtered);

		// List with More than Two char
		List<String> morethantwo = strList.stream()
										  .filter(x -> x.length() > 2)
										  .collect(Collectors.toList());
		System.out.println("More than Two char " + morethantwo);

		// Conver into Uppercase
		String strupeer = strList.stream()
								 .map(x -> x.toUpperCase())
								 .collect(Collectors.joining(", "));

		System.out.println("UpperCase " + strupeer);

	}
}
