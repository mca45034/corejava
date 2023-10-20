package Threadss;

public class Music2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String str=Thread.currentThread().getName();
			System.out.println(str+" is playing");
		}
		try {
			Thread.sleep(1000,999999);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		Runnable r;
		r=new Music2();
		Thread t1=new Thread(r,"pop songs");
		t1.start();
		r=new Music2();
		Thread t2=new Thread(r,"hip hop songs");
		t2.start();
		

	}

	

}
