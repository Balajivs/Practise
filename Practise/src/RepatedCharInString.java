
public class RepatedCharInString {

	public static String repeatedChar(String str) {
		
		String st="";
		
		//String s="";
			    int distinct = 0 ;

			    for (int i = 0; i < str.length(); i++) {

			        for (int j = 0; j < str.length(); j++) {

			            if(str.charAt(i)==str.charAt(j))
			            {
			                distinct++;

			            }
			        }   
			        System.out.println(str.charAt(i)+"--"+distinct);
			        String d=String.valueOf(str.charAt(i)).trim();
			        str=str.replaceAll(d,"");
			        distinct = 0;

			    }
			 
			    return st;

			}
		
	

	
/*public static void repeatedChar() {	
	String str="mmababctamantlslmag";
		//String st="";
		//String s="";
			    int distinct = 0 ;

			    for (int i = 0; i < str.length(); i++) {

			        for (int j = 0; j < str.length(); j++) {

			            if(str.charAt(i)==str.charAt(j))
			            {
			                distinct++;

			            }
			        }   
			        System.out.println(str.charAt(i)+"--"+distinct);
			        String d=String.valueOf(str.charAt(i)).trim();
			        str=str.replaceAll(d,"");
			        distinct = 0;

			    }

			}
		
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mmababctamantlslmag";
		
		repeatedChar(s);
		
		//repeatedChar();
		

	}

}
