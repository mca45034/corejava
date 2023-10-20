package OOps;

abstract class lcd1{
	String name="Nokia";
	int price=12000;
	public void prinf() {
		System.out.println("Lcd name is..."+name);
		System.out.println("lcd price is.."+price);
	}
	abstract public void lcdQuality();
	abstract public void lcdvired();

	
}
class ldsm extends lcd1{
	String name1="one+";
	String price="copper";
	
	@Override
	public void lcdQuality() {
		// TODO Auto-generated method stub
		System.out.println("lcd quality is.."+name1);
		
	}
	@Override
	public void lcdvired() {
		// TODO Auto-generated method stub
		System.out.println("lcd vired is..."+price);
		
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ldsm L=new ldsm();
		L.prinf();
		System.out.println("=============================");
		L.lcdQuality();
		System.out.println("================================");
		L.lcdvired();
		
			

	}

}
