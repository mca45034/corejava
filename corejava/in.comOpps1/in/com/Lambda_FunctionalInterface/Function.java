package in.com.Lambda_FunctionalInterface;
@FunctionalInterface
  interface FunInterface{
	public abstract void disp();
	//public abstract void disp2()
}
public class Function {

	public static void main(String[] args) {
		FunInterface fun=new FunInterface() {
			
			@Override
			public void disp() {
				System.out.println("i am functional interface");
				
			}
		};
		fun.disp();
		

	}

}
