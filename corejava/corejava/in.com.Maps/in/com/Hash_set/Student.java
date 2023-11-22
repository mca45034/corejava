package in.com.Hash_set;

public class Student {
	int id;
	String name;
	String location;
	public Student(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
