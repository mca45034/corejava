package in.com.OopTest;
class GrandFather{
	public void name() {
		System.out.println("i am grand father");
	}
}
class Father extends GrandFather{
	public void name() {
		System.out.println("i am father");
	}
}
class Child extends Father{
	public void name() {
		System.out.println("i am child");
	}
}

public class MultiLevel_Inheritence {

	public static void main(String[] args) {
		GrandFather g=new GrandFather();
		g.name();
		g=new Father();
		g.name();
		g=new Child();
		g.name();

	}

}
