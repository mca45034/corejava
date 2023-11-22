package in.com.corejavaCello_Cloning;

public class Student1 implements Cloneable{
	String name;
	int id;
	public Student1(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
