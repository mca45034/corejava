package in.com.OopTest;
class Phone{
	public void name() {
		System.out.println("i am perent class");
	}
}
class Nokia extends Phone{
	public void name() {
		System.out.println("i am nokia phone");
	}
}
class Samsung extends Phone{
	public void name() {
		System.out.println("i am samsung phone");
	}
}

public class Hererical_inheritence {

	public static void main(String[] args) {
		Phone p;
		p=new Phone();p.name();
		p=new Nokia();p.name();
		p=new Samsung();p.name();
		

	}

}
