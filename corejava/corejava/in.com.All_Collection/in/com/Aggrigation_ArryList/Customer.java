package in.com.Aggrigation_ArryList;

public class Customer {
	int cid;
	String name;
	String location;
	int number;
	public Customer(int cid, String name, String location, int number) {
		super();
		this.cid = cid;
		this.name = name;
		this.location = location;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", location=" + location + ", number=" + number + "]";
	}
	
	

}
