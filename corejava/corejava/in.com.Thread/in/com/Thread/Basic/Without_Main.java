package in.com.Thread.Basic;

public class Without_Main {

	public static void main(String[] args) {
		WithOut w=new WithOut("ram");
		WithOut w1=new WithOut("dev");
		w.run();
		w1.run();

	}

}
