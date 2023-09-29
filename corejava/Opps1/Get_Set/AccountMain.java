package Get_Set;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Account ac=new Account();
	  ac.setAccountNumber(987654323);
	  ac.setAccountType("seving");
	  ac.setBalance(2345);
	  System.out.println(ac.getAccountNumber()+" "+ac.getAccountType()+" "+ac.getBalance());

	}

}
