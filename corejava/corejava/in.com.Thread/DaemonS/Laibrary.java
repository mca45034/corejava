package DaemonS;
class Deamons1 extends Thread{
	
	public void run() {
		 Thread t=Thread.currentThread();
		
		if(t.isDaemon()) {
			Student s=new Student(101, "rahul", "java", "765565875");
			s.Display();
			
		}
		else {
			System.out.println("user define...");
		}
	}
}
class Student{
	int id;
	String name;
	String bookName;
	String contect;
	public Student(int id, String name, String bookName, String contect) {
		this.id = id;
		this.name = name;
		this.bookName = bookName;
		this.contect =  contect;
	}
	public void Display() {
		System.out.println("Student id is...."+id);
		System.out.println("Student name is..."+name);
		System.out.println("student book name is..."+bookName);
		System.out.println("Student contect  number is..."+contect);
	}
	
}

public class Laibrary {

	public static void main(String[] args) {
		Deamons1 d=new Deamons1();
		d.setDaemon(true);
		d.start();
		System.out.println("wel come to shri laibrary...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
