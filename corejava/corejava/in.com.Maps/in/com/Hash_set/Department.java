package in.com.Hash_set;

public class Department {
	int did;
	String dname;
	int salary;
	public Department(int did, String dname, int salary) {
		super();
		this.did = did;
		this.dname = dname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", salary=" + salary + "]";
	}
	

}
