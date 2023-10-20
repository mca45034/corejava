package march1;
class Employee{
	int e_id;
	String e_name;
	Dept d;
	Employee(){
		
	}
	public Employee(int e_id, String e_name, Dept d) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", d=" + d + "]";
	}
	void disp() {
		Dept dep=new Dept();
		dep.show();
		System.out.println("Employee name is..."+e_id);
		System.out.println("Employee name is..."+e_name);
	}
	
	
}
 class Dept{
	
	int d_id;
	String d_name;
 Dept() {
		
	}
	public Dept(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	@Override
	public String toString() {
		return "Dept [d_id=" + d_id + ", d_name=" + d_name + "]";
	}
	public void show() {
		System.out.println("dept id is..."+d_id);
		System.out.println("dept name is .."+d_name);
		
	}
	
	
}

public class Question18 {

	public static void main(String[] args) {
		Dept d1=new Dept(11,"I.T");
		Dept d2=new Dept(12,"HR");
		Dept d3=new Dept(13,"Finence");
		Employee e=new Employee(101,"Sham",d1);
		e.disp();
		Employee e2=new Employee(102,"Rahul",d2);
		e2.disp();
		Employee e3=new Employee(103,"Ankit",d3);
		e3.disp();
	}

}
