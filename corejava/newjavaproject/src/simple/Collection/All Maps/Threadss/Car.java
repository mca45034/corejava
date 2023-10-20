package Threadss;


public class Car implements Runnable{
	
	@Override
	public void run() {
	for(int i=0;i<2;i++) {
		String str=Thread.currentThread().getName();
		System.out.println(str+" AI fetures ");
	}
	try {
		Thread.sleep(1000,999999);
	}catch(InterruptedException e) {
		e.getStackTrace();
	}
		
	}

	public static void main(String[] args) {
		Runnable r;
		r=new Car();
		Thread t1=new Thread(r,"Audi Car");
		t1.start();
		r=new Car();
		Thread t2=new Thread(r,"Mahindra XUV");
		t2.start();
}

	
}
