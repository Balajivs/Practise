public class StringStream {

	public static void main(String[] args) {
		
		
		String str = "Hello Hyderabad ";
		
		String reversed = str.chars()
			    .collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b2.insert(0, b1))
			    .toString();
		
		System.out.println(" "+reversed);
		
	}
}
