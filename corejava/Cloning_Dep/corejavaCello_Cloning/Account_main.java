package corejavaCello_Cloning;

public class Account_main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account a=new Account(101,"sham");
		Account a2=(Account) a.clone();
		a2.balance=306;
		a2.name="ram";
		System.out.println(a.balance);
		System.out.println(a.name);
		System.out.println(a2.balance);
		System.out.println(a2.name);

	}

}
