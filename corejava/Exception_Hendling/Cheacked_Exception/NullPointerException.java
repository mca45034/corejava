package Cheacked_Exception;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r=null;
		
		try {
			System.out.println(r.charAt(3));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
