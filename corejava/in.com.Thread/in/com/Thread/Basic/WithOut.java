package in.com.Thread.Basic;

public class WithOut {
	String name=null;
	public WithOut(String name) {
		this.name=name;
	}
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(name+" "+i);
			
		}
	}

}
