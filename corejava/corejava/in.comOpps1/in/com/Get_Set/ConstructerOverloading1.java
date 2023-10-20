package in.com.Get_Set;

public class ConstructerOverloading1 {
	int id;
	String name;
	int salary1;
	public ConstructerOverloading1(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public ConstructerOverloading1(int id,String name,int salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary1=salary;
	}
	public void diplay() {
		
		this.disp2();
		
		System.out.println(id);
		System.out.println(name);
		
	}
	public void disp2() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary1);
	}
	public static void main(String[] args) {
		ConstructerOverloading1 c=new ConstructerOverloading1(101, "sham");
		c.diplay();
	}

}
