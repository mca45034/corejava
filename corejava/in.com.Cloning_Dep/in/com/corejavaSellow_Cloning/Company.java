package in.com.corejavaSellow_Cloning;

public class Company implements Cloneable{
	String cname;
	String clocation;
	Employee e=new Employee();
	public Company(String cname, String clocation,int eid) {
		super();
		this.cname = cname;
		this.clocation = clocation;
		this.e.eid=eid;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	     Company c=(Company) super.clone();
	    		 e.eid=(int) super.clone();
		         return c;
	}

}
