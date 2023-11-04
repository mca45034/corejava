package in.com.OopTest;

class Emplyoee{
	int id;
	String name;
	Float selary;
	public void cheak() {
		System.out.println("i am default overloading");
	}
	public void cheak(int id) {
		System.out.println("employee id ...."+id);
	}
	public void cheak(String name,int id) {
		System.out.println("employee..."+name+""+id);
	}
	public void cheak (float selary,String name,int id) {
		System.out.println("employee ...."+id+""+name+""+selary);
	}
}
public class Poly_Overloading {

	public static void main(String[] args) {
		Emplyoee e=new Emplyoee();
		e.cheak();
		e.cheak(121);
		e.cheak("sham", 123);
		e.cheak(123542.4f, "dev", 234);
		
	

	}

}
