package Aggrigation_ArryList;

public class Employe2 {
	int eid;
	String ename;
	String departmnet;
	int salary;
	public Employe2(int eid, String ename, String departmnet, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.departmnet = departmnet;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe2 [eid=" + eid + ", ename=" + ename + ", departmnet=" + departmnet + ", salary=" + salary + "]";
	}
	
	

}
