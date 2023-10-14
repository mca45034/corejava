
package Aggrigation_ArryList;

public class Employe {
	int eid;
	String ename;
	String department;
	public Employe(int eid, String ename, String department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
	}
	

}
