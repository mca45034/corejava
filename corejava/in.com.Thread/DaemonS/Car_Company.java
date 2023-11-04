package DaemonS;
class Daemons extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		if(t.isDaemon()) {
			Company cam=new Company("TATA COMPANY", "DELHI", 465465464);
			cam.Disp();
			cam.C.disp2();
		}
		
		else {
			System.out.println("user define");
		}
	}
}
class Company{
	String Cname;
	String Address;
	int phonNo;
	Car C;
	
	public Company(String cname, String address, int phonNo) {
		super();
		Cname = cname;
		Address = address;
		this.phonNo = phonNo;
		//this.C = c;
	}

	public void Disp() {
		
		System.out.println("Company name is..."+Cname);
		System.out.println("Company address is..."+Address);
		System.out.println("Company contect number is..."+phonNo);
	}
}
class Car{
	String name="nexon";
	String fuelTyp="EV";
	int price=150000;
	public Car() {

	}
	public void disp2() {
		System.out.println("Car name is..."+name);
		System.out.println("Car fuel type is.."+fuelTyp);
		System.out.println("Car price is..."+price);
	}
}
public class Car_Company {

	public static void main(String[] args) {
		Daemons d=new Daemons();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("yes");

	}

}
