package in.com.corejavaCello_Cloning;

public class Stu2 {
	 String name;
	Stu s=new Stu();
	public Stu2(String name,int id) {
		this.name=name;
		this.s.id=id;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Stu2 s2=(Stu2) super.clone();
		s2.s=(Stu) s.clone();
		return s2;
	}

}
