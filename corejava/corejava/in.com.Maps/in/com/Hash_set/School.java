package in.com.Hash_set;

public class School {
	String sName;
	String address;
	public School(String sName, String address, Student s) {
		super();
		this.sName = sName;
		this.address = address;
		
	}
	@Override
	public String toString() {
		return "School [sName=" + sName + ", address=" + address + "]";
	}
	

}
