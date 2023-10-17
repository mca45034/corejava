package in.com.Hash_Mapss;

public class Employe {
	int e_id;
	String e_name;
	String location;
	public Employe(int e_id, String e_name, String location) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employe [e_id=" + e_id + ", e_name=" + e_name + ", location=" + location + "]";
	}
	

}
