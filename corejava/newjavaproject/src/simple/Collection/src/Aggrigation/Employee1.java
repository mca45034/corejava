package Aggrigation;

public class Employee1 implements Comparable<Employee1> {
	int id;
	String e_name;
	 static int salary;
	public Employee1(int id,int salary,String e_name) {
		this.id=id;
		this.e_name=e_name;
		this.salary=salary;
		
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", e_name=" + e_name + ", salry=" + salary + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		
		return this.e_name.compareTo(o.e_name);
	}

}
