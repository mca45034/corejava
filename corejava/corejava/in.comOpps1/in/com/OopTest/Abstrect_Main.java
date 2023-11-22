package in.com.OopTest;

abstract class Olg {
	
	public void disp() {
		System.out.println("i am providing 64 led in lcd");
	}
	public abstract void blutooth();
	public abstract void SmartTv();
}
class Mi extends Olg{
	String blutooth="blutooth";
	String SmartTv="SmartTv";
	public void disp() {
		System.out.println("i am providing 64 led in lcd ");
		System.out.println("advance feture in add Mi tv");
	}

	@Override
	public void blutooth() {
		System.out.println("this feture are availeble    "+  blutooth);
		
	}

	@Override
	public void SmartTv() {
		System.out.println("this feture are availeble   "+   SmartTv);
		
	}
}
public class Abstrect_Main {

	public static void main(String[] args) {
	Olg o;
	
	o=new Mi();o.disp();o.blutooth();o.SmartTv();

	}

}
