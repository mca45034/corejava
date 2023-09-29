package Arrays_Method;

public class Course {
	String c_name;
	int c_fee;
	public Course(String c_name, int c_fee) {
		super();
		this.c_name = c_name;
		this.c_fee = c_fee;
	}
	@Override
	public String toString() {
		return "Course [c_name=" + c_name + ", c_fee=" + c_fee + "]";
	}
	

}
