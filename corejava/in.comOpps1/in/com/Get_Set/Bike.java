package in.com.Get_Set;

public class Bike {
	String bname;
	int bprice;
	int bmodale;
	public Bike(String bname, int bprice, int bmodale) {
		this.bname = bname;
		this.bprice = bprice;
		this.bmodale = bmodale;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public int getBmodale() {
		return bmodale;
	}
	public void setBmodale(int bmodale) {
		this.bmodale = bmodale;
	}
	
	

}
