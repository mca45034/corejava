package in.com.corejavaSellow_Cloning;

public class Emp_Comp_Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Company c=new Company("hcl", "indore",101);
		Company c1=(Company) c.clone();
		c1.cname="tcs";
		c1.clocation="pune";
		c1.e.eid=112;
		System.out.println(c.cname);
		System.out.println(c.clocation);
		System.out.println(c.e.eid);
		
		System.out.println("--------------------");
		System.out.println(c1.cname);
		System.out.println(c1.clocation);
		System.out.println(c1.e.eid);
		

	}

}
