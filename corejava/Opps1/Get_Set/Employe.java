package Get_Set;

public class Employe {
	int id;
	String name;
	int age;
	int salary;
	public Employe() {
		
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}

	public void display() {
		System.out.println("Employe id is : "+id);
		System.out.println("Employe name is : "+name);
		System.out.println("Enter the age : "+age);
		System.out.println("Enter the salary : "+salary);
	}
	
	

}
