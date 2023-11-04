package SynchronizedS;
class Authors implements Runnable{
	Thread t; 
     Book b;
	public Authors(Book b) {
		this.b=b;
		t=new Thread(this, "Authore");	
	}
	@Override
	public void run() {
		b.Writing();
		
	}
	
}
class Student implements Runnable{
	Thread t; Book b2;
	public Student(Book b2) {
		this.b2=b2;
		t=new Thread(this, "Student");
	}
	@Override
	public void run() {
		b2.Reading();
		
	}
}
class Book{
	synchronized void Writing() {
		String s=Thread.currentThread().getName();
		System.out.println(s+" : Authore writing book !!!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("book is avileble...");
	}
	synchronized void Reading() {
		String s1=Thread.currentThread().getName();
		System.out.println(s1+" : reading book !!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("student read book....");
	}
}

public class BookReadWrite {

	public static void main(String[] args) {
		Book b=new Book();
		Student s=new Student(b);
		Thread t=new Thread(s, "sagar");
		t.start();
		Student s1=new Student(b);
		Thread t1=new Thread(s1, "ram");
		t1.start();
		
		Student s2=new Student(b);
		Thread t2=new Thread(s2, "rahul");
		t2.start();
		Student s3=new Student(b);
		Thread t3=new Thread(s3, "himanshu");
		t3.start();
		
		Authors a=new Authors(b);
		Thread t4=new Thread(a, "Dr. Sahu sir");
		t4.start();
		 
		
	    
	    
	    

	}

}
