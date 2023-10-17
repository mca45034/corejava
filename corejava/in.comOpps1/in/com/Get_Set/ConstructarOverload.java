package in.com.Get_Set;

public class ConstructarOverload {
	int id;
	String name;
	double salary;
	public ConstructarOverload() {
		id=102;
		
		
		System.out.println("it is default constructar");
	}
	public ConstructarOverload(int cid,String hname) {
		super();
		
		this.id=cid; this.name=hname;
		
	}
	public ConstructarOverload(int did, String hcname,double csalary) {
		super();
		this.id=did;  this.name=hcname;  this.salary=csalary;
		
	}

}

