package SynchronizedS;
class Authore implements Runnable{
	Writing w;Thread t;
	public Authore(Writing w) {
		this.w=w;
		t=new Thread(this, "Writing");
	}
	@Override
	public void run() {
		w.write();
		
	}
}
class User1 implements Runnable{
	Writing w;Thread t;
	public User1(Writing w) {
		this.w=w;
		t=new Thread(this, "reading");
		
	}
	@Override
	public void run() {
		w.read();
		
	}
}
class Writing {
	synchronized void write() {
		String s=Thread.currentThread().getName();
		System.out.println(s+"authore write book");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("book is availeble");
		//notifyAll();
	}
	
	synchronized void read() {
		String s=Thread.currentThread().getName();
		System.out.println(s+"read a book");
		
//		try {
//			wait();
//			String s=Thread.currentThread().getName();
//			System.out.println(s+"read a book");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
class User2 implements Runnable{

	@Override
	public void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
public class Commications {

	public static void main(String[] args) {
		Writing w=new Writing();
		User1 u=new User1(w);
		Thread t=new Thread(u, "rahul");
		t.start();
		User1 u1=new User1(w);
		Thread t1=new Thread(u1, "dev");
		t1.start();
		Authore a=new Authore(w);
		Thread t2=new Thread(a, "Dr. Loxy")	;
		t2.start();
//		User2 u2=new User2();
//		Thread t3=new Thread(u2, "non");
//		t3.start();
      
	}

}
