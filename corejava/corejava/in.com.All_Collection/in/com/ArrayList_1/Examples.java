package in.com.ArrayList_1;
class Ram{
	int id ;
	String name;int slary;
	public Ram() {
		// TODO Auto-generated constructor stub
		this(12,"dev");
		System.out.println("sham");
	}
	public Ram(int id,String name) {
		// TODO Auto-generated constructor stub
		this(123,"ram",2345);
		System.out.println("ram");
	}
	public Ram(int id,String name,int slary) {
		// TODO Auto-generated constructor stub
		
		System.out.println("dev");
	}
	
}
class Sagar extends Ram{
	String name;
	public Sagar(String name) {
		//super();
		System.out.println("i am child class constructer"+name);
	}
	
}

public class Examples {

	public static void main(String[] args) {
		Sagar s=new Sagar("pappu");
	
		
	//	r.id=10;
		//r.name="sham";
		

	}

}

