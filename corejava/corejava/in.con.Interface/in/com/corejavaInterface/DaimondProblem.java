package in.com.corejavaInterface;
interface First {
	 default void disp() {
		System.out.println("i am first interface");
	}
	abstract void sum();
}
interface Second {
	default void disp() {
		System.out.println("i am Second interface");
	}
}
class Coman implements First,Second{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		First.super.disp();
		Second.super.disp();
	}

	@Override
	public void sum() {
		
		
	}
	
}

public class DaimondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coman c=new Coman();
		c.disp();

	}

}
