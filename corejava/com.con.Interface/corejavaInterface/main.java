package corejavaInterface;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		Customer4 c=new Customer4("bobs",101);
		Customer4 c1=(Customer4) c.clone();
		c1.name="ram";
		c1.a4.balance=102;
		System.out.println(c.name);
		System.out.println(c.a4.balance);
		System.out.println(c1.name);
		System.out.println(c1.a4.balance);
		

	}

}
