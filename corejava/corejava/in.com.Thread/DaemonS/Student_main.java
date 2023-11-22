package DaemonS;
class Stu extends Thread{
	@Override
	public void run() {
		Thread  t=Thread.currentThread();
		if(t.isDaemon()) {
			Students s=new Students(12, "rahul", 25);
			s.disp();
			t.start();
		}
		else {
			System.out.println("user difine");
		}
	}
}
class Students{
	int id;String name;int age;


	public Students(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void disp(){
		System.out.println("Student id is.."+id);
		System.out.println("student name is.."+name);
		System.out.println("student age is.."+age);
	}
	
}
public class Student_main {

	public static void main(String[] args) {
		Thread t=new Stu();
		Thread t1=new Stu();
		Thread t2=new Stu();
		t.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		

	}

}
