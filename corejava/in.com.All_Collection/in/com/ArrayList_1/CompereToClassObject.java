package in.com.ArrayList_1;

public class CompereToClassObject {
	public static void main(String[] args) {
		
		CompareTo c=new CompareTo(1, "sham", "indore");
		CompareTo c1=new CompareTo(1, "sham", "indore");
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
	}

}
