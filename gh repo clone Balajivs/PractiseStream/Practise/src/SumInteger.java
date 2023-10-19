import java.util.Arrays;

public class SumInteger {

	public static void main(String[] args) {

		int a[] = {2,3,4,5,6,7,8,9};
		
		
		 int sumofelement=  Arrays.stream(a).sum();
		 
		 System.out.println(" "+sumofelement);

		 
	}

}
