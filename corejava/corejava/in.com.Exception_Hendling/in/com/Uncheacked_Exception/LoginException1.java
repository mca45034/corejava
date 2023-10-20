package in.com.Uncheacked_Exception;
class  LoginException extends RuntimeException{
	public LoginException(String s) {
		super();
	}
	void cheaked(String name) {
		if(name.equals("sham")) {
			System.out.println("valid user");
		}
		else {
			throw new LoginException("uygkuyg");
		}
	}
}


public class LoginException1  {
	public static void main(String[] args) {
		
		LoginException l=new LoginException("ergewf");
		String name="sham";
		try {
			l.cheaked(name);
		} catch (Exception e) {
			System.out.println("invalid");
		}
		
			
	

}
}
