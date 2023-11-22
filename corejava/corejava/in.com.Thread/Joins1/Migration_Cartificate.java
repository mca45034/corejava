package Joins1;
class Davv implements Runnable{
	Thread t;
	
	public Davv() throws InterruptedException {
		t=new Thread(this, "DAVV");
		t.start();
		t.join();
		
	}

	@Override
	public void run() {
		System.out.println("please verified youre enrollment number !!!");
		
	}
}
class Student implements Runnable{
	Thread t;
	String enrollNo;
	String name;
	String classs;
	int contectNo;
	public Student(String enrollNo, String name, String classs, int contectNo) throws InterruptedException {
		
		this.enrollNo = enrollNo;
		this.name = name;
		this.classs = classs;
		this.contectNo = contectNo;
		t=new Thread(this, "Student");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("verifing youre Enrollment number.'..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Student Enrollment Number .... "+enrollNo);
		System.out.println("Student name is..... "+name);
		System.out.println("Student class name is.."+classs);
		System.out.println("Student contect number is.... "+contectNo);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("verfeid completed...");
		
	}
	
	
}
class Done23 implements Runnable{
	Thread t;
	public Done23() throws InterruptedException {
		t=new Thread(this,"Done");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("");
		System.out.println("Searchinh youre migration degree");
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("please collect youre Migration and Degree !!!");
		
	}
}

public class Migration_Cartificate {

	public static void main(String[] args) throws InterruptedException {
		Davv d=new Davv();
		Student s=new Student("DSA4503421", "rahul kirar", "MCA", 930146673);
		Done23 da=new Done23();
		

	}

}
