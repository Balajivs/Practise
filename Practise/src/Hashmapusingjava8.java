import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmapusingjava8 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,4,5,6,7,7,1,2,1};
		
		
		//Set<Integer> set = new HashSet<>();
		
		
		
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("duplicates " +a[i]);
				}
			}
		}
		
		
	}
}
