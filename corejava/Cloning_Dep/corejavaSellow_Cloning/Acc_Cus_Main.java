package corejavaSellow_Cloning;


public class Acc_Cus_Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c=new Customer("sham", 231);
		Customer c1=(Customer) c.clone();
		c1.name="Dev";
		c1.a.balance=9211;
		System.out.println(c.name);
		System.out.println(c.a.balance);
		System.out.println(c1.name);
		System.out.println(c1.a.balance);

	}

}
