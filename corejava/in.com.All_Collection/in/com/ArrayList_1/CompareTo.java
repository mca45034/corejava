package in.com.ArrayList_1;

public class CompareTo {
	int id;
	String name;
	String address;
	int c,c1;
	public CompareTo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CompareTo)) {
		return false;
	}
		CompareTo c=(CompareTo) obj;
		boolean b=this.id==c.id && this.name==c.name && this.address==c.address;
		return b;
	
	}
	@Override
	public int hashCode() {
		String s=id+name+address;
		return s.hashCode();
	}
}
