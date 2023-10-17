package in.comAggrigation_bow;

public class Department {
	int depId;
	String depName;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public void disp1() {
		System.out.println("Department name is.. "+depId);
		System.out.println("Department name is.. "+depName);
	}
	

}
