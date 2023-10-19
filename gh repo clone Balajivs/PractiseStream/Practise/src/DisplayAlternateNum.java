
public class DisplayAlternateNum {

	public static void main(String[] args) {
		
		int[] arr = {11, 12, 13, 14, 15,16,17,18,19};
		
		int len = arr.length;
		
		for(int i=0;i<len;i=i+2) {
			
			System.out.println(arr[i]);
		}
	}
}
