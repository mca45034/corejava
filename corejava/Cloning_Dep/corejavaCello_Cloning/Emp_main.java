package corejavaCello_Cloning;
class Emp implements Cloneable{
	String name;
	String dep;
	public Emp(String name,String dep) {
		this.name=name;
		this.dep=dep;
	}
	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
}

public class Emp_main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e=new Emp("ram","hr");
		Emp e1=(Emp) e.Clone();
		e1.name="Dev";
		e1.dep="it";
		System.out.println(e.name);
		System.out.println(e.dep);
		
		System.out.println(e1.name);
		System.out.println(e1.dep);

	}

}
