package in.com.Thread.Basic;

class Runw implements Runnable{
	String name=null;
	public Runw(String name) {
		this.name=name;
	}
	@Override
	public
	void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+""+i);
			
		}
	}
}
public class Implementss {

	public static void main(String[] args) {
		Runw r=new Runw("sham");
		Runw r1=new Runw("dev");
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.setPriority(8);
		t1.setPriority(4);
		t.start();
		t1.start();

	}

}
