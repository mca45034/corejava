package in.com.corejavaAbstraction;
abstract class Olg{
	public void disp(){
		System.out.println("32 led there are in olg lcd");
	}
	abstract public void tauchScreen();
	abstract public void carsur();
}
class Samsung extends Olg{
	

	@Override
	public void tauchScreen() {
		System.out.println("samsung providing touch screen");
		
	}

	@Override
	public void carsur() {
		System.out.println("samsung providing carsur..");
		
	}
	
}

public class LCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s=new Samsung();
		s.disp();
		s.carsur();
		s.tauchScreen();

	}

}
