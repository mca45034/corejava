package in.com.Aggrigation_ArryList;

public class Banks {
	String name;
	String location;
	Customer C;
	public Banks(String name, String location, Customer c) {
		super();
		this.name = name;
		this.location = location;
		C = c;
	}
	@Override
	public String toString() {
		return "Banks [name=" + name + ", location=" + location + "]";
	}
	

}
