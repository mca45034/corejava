package in.com.Uncheacked_Exception;

public class Evan_odd_Exception{
	
	public static void tryNumber(int n) {
		try {
			IllegalArgumentException(n);
			System.out.println(n+ ": is even");
		} catch (Exception e) {
			System.out.println("error  : "  +e.getMessage());
		}
	}
	public static void IllegalArgumentException(int number) {
		if(number %2 !=0) {
			throw new java.lang.IllegalArgumentException(number + "  is odd");
		}
	}
	
	public static void main (String []args) {
		int n=11;
		tryNumber(n);
		n=31;
		tryNumber(n);
	}
	
	

}
