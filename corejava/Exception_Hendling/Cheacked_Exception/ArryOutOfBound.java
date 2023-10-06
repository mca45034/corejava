package Cheacked_Exception;

public class ArryOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		
		try {
			System.out.println(a[6]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
