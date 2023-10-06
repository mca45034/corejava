package corejavaSellow_Cloning;

public class Account1 implements Cloneable{
	int balance;
//	public Account1(int balance) {
//		// TODO Auto-generated constructor stub
//		this.balance=balance;
//	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
