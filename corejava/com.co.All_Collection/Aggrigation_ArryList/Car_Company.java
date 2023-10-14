package Aggrigation_ArryList;

public class Car_Company {
	String Cname;
	String Caddress;
	Car c;
	public Car_Company(String cname, String caddress, Car c) {
		super();
		Cname = cname;
		Caddress = caddress;
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "Car_Company [Cname=" + Cname + ", Caddress=" + Caddress + ", c=" + c + "]";
	}
	

}
