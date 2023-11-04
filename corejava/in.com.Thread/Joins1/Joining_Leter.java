package Joins1;
class School implements Runnable{
	Thread t;
	public School() throws InterruptedException {
		t=new Thread(this, "School");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("plese take youre documents !!!!");
		
	}
}
class Leter implements Runnable{
	int id;
	String name;
	int contectNo;
	Thread t;
	public Leter(int id, String name, int contectNo) throws InterruptedException {
		super();
		this.id = id;
		this.name = name;
		this.contectNo = contectNo;
		t=new Thread(this, "Leter");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("verifing  youre document");
		try {
			wait(1000);
			notify();
			Thread.sleep(3000);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Student id is..."+id);
		System.out.println("Student name is..."+name);
		System.out.println("Student contectNumber is...."+contectNo);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("verifing is done....!!!!");
		
	}
	
}
class Verified implements Runnable{
	Thread t;
	public Verified() throws InterruptedException {
		t=new Thread(this, "Verified");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("youre Document are verifieds !!!!");
		
	}
	
}
public class Joining_Leter {

	public static void main(String[] args) throws InterruptedException {
		School s=new School();
		Leter l=new Leter(101, "sham", 465468684);
	     Verified v=new Verified();
	     try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
