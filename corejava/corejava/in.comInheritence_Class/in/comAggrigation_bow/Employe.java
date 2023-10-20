package in.comAggrigation_bow;



public class Employe{
	int id;
	String name;
	int salary;
	Department d;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public void disp2() {
		System.out.println("Employe  id is.. "+id);
		System.out.println("Employe name is.."+name);
		System.out.println("Employe salary is.."+salary);
	}
	
	
	

}
