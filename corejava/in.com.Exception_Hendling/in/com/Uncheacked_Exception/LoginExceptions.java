package in.com.Uncheacked_Exception;

public class LoginExceptions extends Exception{
	void cheak(String pass) throws LoginExceptions{
		if(pass.equals("123@kirar")) {
			try {
				throw new LoginExceptions();
			} catch (LoginExceptions e) {
				System.out.println("password is excuted...");
				e.printStackTrace();
			}
		}
		else {
			System.out.println("password invelid...");
		}

	}

	public static void main(String[] args) {
		LoginExceptions l=new LoginExceptions();
		String pass="123@kirar2";
		try {
			l.cheak(pass);
		} catch (LoginExceptions e) {
			e.printStackTrace();
		}

	}

}
