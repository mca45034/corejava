package Hash_Mapss;

public class Department {
	int d_id;
	String d_name;
	public Department(int d_id, String d_name) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + "]";
	}
	

}
