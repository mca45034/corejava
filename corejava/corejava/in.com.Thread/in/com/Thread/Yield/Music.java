package in.com.Thread.Yield;

public class Music extends Thread{

	public void run() {
		for (int i = 0; i < 3; i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s+"music play");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
public static void main(String[] args) {
	Music m=new Music();
	m.setName("jazz music");
	m.start();
	
	Music m1=new Music();
	m1.setName("classic music");
	m1.start();
	
}
}
