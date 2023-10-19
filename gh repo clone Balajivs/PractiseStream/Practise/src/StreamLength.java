import java.util.ArrayList;
import java.util.List;

public class StreamLength {

	
	public static void main(String[] args) {
		
		
		List<String> strLst = new ArrayList();
		
		strLst.add("Welcome");
		strLst.add("to");
		strLst.add("India");
		
		// More that 4 length
		strLst.stream().filter(x->x.length()>4)
		 			   .forEach(x->System.out.println(x));
		
		//Upper Case
		strLst.stream().map(x->x.toUpperCase())
					   .forEach(x->System.out.println(x));
		
		
		
	}

}
