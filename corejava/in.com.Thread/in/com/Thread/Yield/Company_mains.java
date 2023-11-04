package in.com.Thread.Yield;
class Company extends Thread{
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println(s+" manufactured by Audi company !!!!");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
public class Company_mains {

	public static void main(String[] args) {
		Company c=new Company();
		c.setName("CAR");
		c.start();
		
		Company c1=new Company();
		c1.setName("BIKE");
		c1.start();

	}

}
