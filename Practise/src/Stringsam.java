import java.util.Arrays;

public class Stringsam {

	
	public static void main(String[] args) {
		
		
		String str = "Hi h o w are y o u ";
		
		str = str.replaceAll(" ", "");
		
		System.out.println(str);
		
		int ar[] = {2,4,3,5,7,6,8,};
		
		int len = ar.length;
		
		Arrays.sort(ar);
		System.out.println(" "+ar[0]);
		System.out.println(" "+ar[ar.length-1]);
		
		System.out.println("second highest "+ar[ar.length-2]);
	}
}
