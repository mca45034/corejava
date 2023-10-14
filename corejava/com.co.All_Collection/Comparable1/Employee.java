package Comparable1;

public class Employee implements Comparable<Employee>{
	int eid;
	String ename;
	String location;
	int phone;
	public Employee(int eid, String ename, String location, int phone) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.location = location;
		this.phone = phone;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid<o.eid)
			return 1;
		else if(this.eid>o.eid)
			return -1;
		 return 0;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", location=" + location + ", phone=" + phone + "]";
	}
	
	

}
