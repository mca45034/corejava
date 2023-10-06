package corejavaInterface;

public class Customer4 implements Cloneable{
	String name;
	Account4 a4=new Account4();
	public Customer4(String name, int balance) {
		super();
		this.name = name;
		this.a4.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer4 c=(Customer4) super.clone();
		c.a4=(Account4) a4.clone();
		return c;
	}

}
