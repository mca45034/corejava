package in.com.Thread.Yield;

class Thread11 implements Runnable{
	String name;
	 Thread11(String name) {
		this.name=name;
	}

	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(s+" "+name);
			Thread.yield();
			
		}
		
	}
	
}
class Thread21 implements Runnable{
	String name;
	Thread21(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		String s1=Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(s1+" "+name);
			Thread.yield();
			
		}
		
	}
}
public class Yield_Method {

	public static void main(String[] args) {
		Runnable r;
		
		r=new Thread11("sham");
		Thread t=new Thread(r, "Thread11");
		t.getPriority();
		t.start();
		
		r=new Thread21("dev");
		Thread t1=new Thread(r, "Thread21");
		t1.getPriority();
		t1.start();
		
		

	}

}
