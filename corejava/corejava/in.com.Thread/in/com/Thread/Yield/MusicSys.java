package in.com.Thread.Yield;

public class MusicSys extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s+" : music play");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.err.print(e);
			}
			
			
		}
    }

	public static void main(String[] args) {
		MusicSys s=new MusicSys();
		s.setName("pop music");
		s.start();
		MusicSys s1=new MusicSys();
		s1.setName("classic music");
		s1.start();
		

	}

}
