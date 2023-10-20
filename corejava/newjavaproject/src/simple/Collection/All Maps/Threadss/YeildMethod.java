package Threadss;
class ImpThread implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s+"---->"+i);
			Thread.yield();
		}
		
	}
	
}
class NotImpThread implements Runnable{

	@Override
	public void run() {
		for(int i1=1;i1<4;i1++) {
			String s1=Thread.currentThread().getName();
			System.out.println(s1+"---->"+i1);
		}
		
	}
	
}

public class YeildMethod {

	public static void main(String[] args) {
		Runnable r;
		r=new ImpThread();
		Thread t1=new Thread(r,"ImpThread");
		t1.setPriority(3);
		t1.start();
		r=new NotImpThread();
		Thread t2=new Thread(r,"NotImpThread");
		t2.setPriority(4);
		t2.start();

	

}

}
