package in.com.FunctionalInterfacess;
@FunctionalInterface
 interface DefaultStaticInterface {
	public void abstractmethod();
	public default void Defaultmethod() {
		System.out.println("i am default method...");
	}
	public static void staticmethod() {
		System.out.println("i am static method");
	}

}

public class Combain {
	public static void main(String[] args) {
		DefaultStaticInterface d=new DefaultStaticInterface() {
			
			@Override
			public void abstractmethod() {
				System.out.println("abstract method ovverride");
				
			}
		};
		d.Defaultmethod();
		d.abstractmethod();
		DefaultStaticInterface.staticmethod();
		
	}
}
