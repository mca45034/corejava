package Threadss;

public class Factory  implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<4;i++) {
			String str=Thread.currentThread().getName();
			System.out.println(str+"Balaji Factory");
		}
		try {
			Thread.sleep(100,9999);
		}catch(InterruptedException e) {
			e.getStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		
		Runnable r;
		r=new Factory();
		Thread t1=new Thread(r,"Wrapers");
		t1.start();
		Thread t2=new Thread(r,"Popcorn");
		t2.start();
		

	}

	

}
