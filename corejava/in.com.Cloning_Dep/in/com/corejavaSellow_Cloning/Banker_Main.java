package in.com.corejavaSellow_Cloning;
class Banker1 implements Cloneable{
	int bankerID;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
class Banker12 implements Cloneable{
	String name;
	Banker1 b=new Banker1();
	public Banker12(String name, int bankerID) {
		this.name=name;
		this.b.bankerID=bankerID;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Banker12 b1=(Banker12) super.clone();
		b1.b=(Banker1) b.clone();
		return b1;
	}
}
public class Banker_Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Banker12 bak=new Banker12("sham", 1123);
		Banker12 bak2=(Banker12) bak.clone();
		bak2.name="dev";
		bak2.b.bankerID=3456;
		
		System.out.println(bak.name);
		System.out.println(bak.b.bankerID);
		
		System.out.println(bak2.name);
		System.out.println(bak2.b.bankerID);
	}
	
}
