
public class CheckPrimeNumber {
	
	public static boolean isPrime(int number) {

	    // Low numbers
	    if (number < 2) {
	      return false;
	    }

	    // Even numbers
	    if (number % 2 == 0) {
	        return number == 2;
	    }

	    // Odd numbers
	    int limit = (int)(0.1 + Math.sqrt(number));
	    
	    for (int i = 3; i <= limit; i += 2) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	
	public static void main(String[] args) {
		
		boolean isprime = isPrime(5);
		
		System.out.println(isprime);
	}
}
