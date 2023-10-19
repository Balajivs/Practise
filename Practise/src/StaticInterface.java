
interface  myinterface {
	
	static void m1() {
		
		System.out.println("Hello from m1 myinterface");
	}
	
	default void hi() {
		
		System.out.println(" hi default method");
	}
}


public class StaticInterface implements myinterface{

	
	public static void main(String[] args) {
		
		StaticInterface obj = new StaticInterface();
		
		obj.hi();
		
		myinterface.m1();
		
		
	}
	
	
	
}
