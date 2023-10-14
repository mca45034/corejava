package ArrayList_1;

public class Student {
	int id;
	String name;
	float fee;
	public Student(int id, String name, float fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	

}
