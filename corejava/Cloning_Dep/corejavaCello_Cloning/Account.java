package corejavaCello_Cloning;

public class Account implements Cloneable{
	int balance;
	String name;
	public Account(int balance,String name) {
		this.balance=balance;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
