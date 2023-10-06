package corejavaSellow_Cloning;

public class Customer implements Cloneable{
	String name;
	//Account1 a;
	Account1 a=new Account1();
	public Customer(String name,int balance) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.a.balance=balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c=(Customer) super.clone();
		c.a=(Account1) a.clone();
		return c;
	}
	

}
