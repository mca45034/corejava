package Threadss;


public class Music extends Thread {
	public void run() {
		for(int i=0;i<3;i++) {
			String str=Thread.currentThread().getName();
			System.out.println(str+" is playing");
		}
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Music m=new Music();
		m.setName("Rock songs");
		m.start();
		Music m1=new Music();
		m1.setName("classical songs");
		m1.start();
		

	}

}
