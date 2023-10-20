package in.com.corejavaCello_Cloning;

public class Bankes implements Cloneable{
	int id;
	String name;
	
	public Bankes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
