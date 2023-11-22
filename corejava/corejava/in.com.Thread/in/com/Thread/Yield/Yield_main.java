package in.com.Thread.Yield;

class Thread1 implements Runnable{
	String name;
	public Thread1(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+""+name);
			Thread.yield();
			
			
		}
		
	}
	
}
class Thread2 implements Runnable{
	String name;
public Thread2(String name) {
	this.name=name;
}
@Override
public void run() {
	String t=Thread.currentThread().getName();
	for (int i = 0; i < 5; i++) {
		System.out.println(t+" "+name);
		Thread.yield();
		
	}
	
	
}
}
public class Yield_main {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r;
		r=new Thread1("sham");
		Thread t=new Thread(r, "Thread1");
		t.getPriority();
		t.start();
		
		r=new Thread2("dev");
		Thread t1=new Thread(r, "Thread2");
		t1.getPriority();
		t1.start();
		

	
}

	
}