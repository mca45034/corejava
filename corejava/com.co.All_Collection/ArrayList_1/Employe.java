package ArrayList_1;

public class Employe {
	private int e_id;
	private String e_name;
	private int e_salary;
	private static String name="HCL Tech.";
	
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employe.name = name;
	}
	@Override
	public String toString() {
		return "Employe [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary + "]";
	}
	
	

}
