package corejavaAbstraction;
abstract class Mobile {
	static String name="NOKIA";
	static int price=35000;
	Mobile(String color){
		System.out.println("mobile color is... :"+color);
	}
	void ram() {
		System.out.println("32 gb ram");
	}
	void rom() {
		System.out.println("64 gb rom");
	}
	abstract void flashLight();
}
class CemaraWithFlash extends Mobile {

	CemaraWithFlash(String color) {
		super(color);
		
	}

	@Override
	void flashLight() {
		System.out.println("providing flashLight");
		
	}
	
	
}

public class CemaraMan {
	

	public static void main(String[] args) {
		
		CemaraWithFlash c=new CemaraWithFlash("blue");
		c.flashLight();
		c.ram();
		c.rom();
		//System.out.println(name);

	}

}
