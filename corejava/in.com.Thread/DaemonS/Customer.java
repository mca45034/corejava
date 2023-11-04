package DaemonS;
class Bank extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		if(t.isDaemon()) {
			Cust c=new Cust(101,"sham", 34, "56563665");
			c.Disp();
		}
		else {
			System.out.println("user define...");
		}
	}
}
  class Cust{
	  int id;
	  String name;
	  int age;
	  String acc;
	
	   public Cust(int id, String name, int age, String acc) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.acc = acc;
	}

	void Disp() {
		  System.out.println("Customer id is.... "+id);
		  System.out.println("Customer name is... "+name);
		  System.out.println("Customer age is... "+age);
		  System.out.println("Customer acc is... "+acc);
	  }
  }

public class Customer {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setDaemon(false);
		b.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Deamon is running....");

	}

}
