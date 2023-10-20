package Threadss;
class Author implements Runnable{
	Wrting w;
	Thread t;
	Author(Wrting w){
		this.w=w;
		t=new Thread(this,"Wrting");
	}

	@Override
	public void run() {
		w.write();
		
	}
	
}
class user1 implements Runnable{
	Writnig w;
	Thread t;
	user1(Wrting w){
		this.w=w;
		t=new Thread(this,"reading");
	}
	@Override
	public void run() {
		w.read();
		
	}
}
class Wrting{
	synchronized void write() {
		String s1=Thread.currentThread().getName();
		System.out.println(s1+"Author is writing a book");
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		}
	System.out.println("Book is available");
	}
	
	synchronized void read() {
		try {
		String s2=Thread.currentThread().getName();
		System.out.println(s2+"can read books");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
class User2 implements Runnable
{

	@Override
	public synchronized void run() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class Commonication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
