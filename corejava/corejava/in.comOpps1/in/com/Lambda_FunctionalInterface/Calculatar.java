package in.com.Lambda_FunctionalInterface;

 @FunctionalInterface
public interface  Calculatar {
	int operator(int x,int y);
	default void Display() {
		System.out.println("i am lambda expretion");
		System.out.println();
	}
//	String meean(String s1,String s2);
//	default void Disp2() {
//		System.out.println("i am String lambda");
//	}
	

}
