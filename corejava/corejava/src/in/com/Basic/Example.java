package in.com.Basic;

import in.com.corejavaInterface.main;
class Exam{
	int id;
	String name;
	String location;
	public Exam(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	void disp() {
		System.out.println(id);
		System.out.println(name);
	}
	public Exam(int id, String name, String location) {
		this(100,"sham");
		this.id = id;
		this.name = name;
		this.location = location;
	}
	void disp1() {
		disp();
		System.out.println(id);
		System.out.println(name);
		System.out.println(location);
	}
	
	
}

public class Example {
	public static void main(String[] args) {
		Exam e=new Exam(199, "ram", "indore");
		e.disp1();
		
		
		
	}
 
	
}
