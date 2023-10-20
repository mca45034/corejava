package in.com.Cheacked_Exception;

public class StringOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="rahul";
		
		try {
			System.out.println(name.charAt(7));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
