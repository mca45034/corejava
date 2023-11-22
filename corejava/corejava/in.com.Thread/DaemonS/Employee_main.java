package DaemonS;
class Threades extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		
		if(t.isDaemon()) {
			
			Employee e=new Employee(101, "sham", "noida");
			e.Display();
			t.start();
		}
		else if(t.isDaemon()) {
			Employee2 e1=new Employee2(103, "ram", "pune");
			e1.Display1();
			t.start();
		}
		else {
			System.out.println("user thread");
		}
	}
}
class Employee{
	int id;
	String name;
	String location;
	public Employee(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public void Display() {
		System.out.println("Employee id is..."+id);
		System.out.println("Employee name is..."+name);
		System.out.println("Employee location is..."+location);
	}
}

class Employee2{
	int id1;
	String name1;
	String location1;
	public Employee2(int id1, String name1, String location1) {
		
		this.id1 = id1;
		this.name1 = name1;
		this.location1 = location1;
	}
	public void Display1() {
		System.out.println("Employee id is..."+id1);
		System.out.println("Employee name is..."+name1);
		System.out.println("Employee location is..."+location1);
	}
}

public class Employee_main {

	public static void main(String[] args) {
		
		Threades t =new Threades();
		Threades t1 =new Threades();
		Threades t2 =new Threades();
		
		t.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
		
		
	}

}
	

