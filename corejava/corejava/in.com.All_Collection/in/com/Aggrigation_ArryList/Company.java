package in.com.Aggrigation_ArryList;

public class Company {
	
	String cname;
	String clocation;
	Employe e;
	public Company(String cname, String clocation, Employe e) {
		super();
		this.cname = cname;
		this.clocation = clocation;
		this.e = e;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", clocation=" + clocation + ", e=" + e + "]";
	}
	
}
