package Aggrigation;

public class Employe {
	int eid;
	String ename;
	String edepartment;
	public Employe(int eid, String ename, String edepartment) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", edepartment=" + edepartment + "]";
	}
	

}
