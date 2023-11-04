package DaemonS;
class Threades extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		
		if(t.isDaemon()) {
			
			Employee e=new Employee(101, "sham", "noida");
			e.Display();
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
	

