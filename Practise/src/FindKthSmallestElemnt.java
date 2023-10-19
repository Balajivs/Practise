import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindKthSmallestElemnt {
	
		// 2nd smallest element
		// Inputs
		static int k = 2;
	
		static Integer[] myIntArray = { 2, 3, 1, 4, -2, 0, -3, 0, -1, 5 };
	
		public static void main(String[] args) {
	
			List<Integer> list = Arrays.asList(myIntArray);
	
			System.out.println(list.stream().sorted().distinct().limit(k).skip(k - 1).collect(Collectors.toList()));
	}

}
