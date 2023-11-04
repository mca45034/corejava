package in.com.Thread.Basic;
class Run extends Thread{
	String name=null;
	public Run(String name) {
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
public class Extends {

	public static void main(String[] args) {
		Run r=new Run("Dev");
		r.setPriority(8);
		r.start();
		Run r1=new Run("pappu");
		
		r1.setPriority(3);
		
		r1.start();

	}

}
