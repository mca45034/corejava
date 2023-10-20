package Aggrigation;

public class Suplayer {
	String sname;
	String location;
	int contect;
	Item t;
	public Suplayer(String sname, String location, int contect, Item t) {
		super();
		this.sname = sname;
		this.location = location;
		this.contect = contect;
		this.t = t;
	}
	@Override
	public String toString() {
		return "Suplayer [sname=" + sname + ", location=" + location + ", contect=" + contect + ", t=" + t + "]";
	}
	
}
