import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElementUsingStream {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Ram", "Balaji", "Ram", "Dilip", "Shiv", "Shiv", "Ram");
		List<String>  strlst = strList.stream().distinct().collect(Collectors.toList());
		System.out.println("Dulicate Strings "+ strlst);
		
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		List<String>  lst = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Dulicate String "+ lst);
		
		List<Integer> IntLst = Arrays.asList(1,3,2,4,3,5,6,2,4);
		List<Integer>  IntegerLst = IntLst.stream().distinct().collect(Collectors.toList());
		System.out.println(" IntegerLst"+ IntegerLst);
		
		Set<Integer> setWithoutDuplicates = IntegerLst.stream()
				.collect(Collectors.toSet());
		System.out.println(" Without Duplicates"+ IntegerLst);
	}
	
}

