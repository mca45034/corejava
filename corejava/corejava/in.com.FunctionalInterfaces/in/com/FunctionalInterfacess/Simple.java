package in.com.FunctionalInterfacess;

interface Hello{
	public void say();
	
}
public class Simple {

	public static void main(String[] args) {
//		Hello h=new Hello() {
//			
//			@Override
//			public void say() {
//				System.out.println("i love my india...");
//				
//			}
//		};
//		h.say();
		Hello h =()-> System.out.println("i love mt india");

	}

}
