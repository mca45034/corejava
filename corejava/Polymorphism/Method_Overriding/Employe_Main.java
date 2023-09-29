package Method_Overriding;

import java.util.Scanner;

class EmployeP{
	void emp() {
		System.out.println("welcome to HCL infotech!!!!!");
	}
	void emp(String name) {
		System.out.println("Company name is..."+name);
	}
	
}
class Employe extends EmployeP{
	int id;
	String name;
	String dep;
	int salary;
	void emp() {
		super.emp();
		
		System.out.println("i am child class");
	}
	void emp(String name) {
		super.emp(name);
		System.out.println("i am child.. "+name);
	}
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void Disp() {
		System.out.println("employe id is.. "+id);
		System.out.println("employe name is... "+name);
		System.out.println("employe dep is... "+dep);
		System.out.println("employe salary is... "+salary);
	}
	
	
	
}

public class Employe_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employe id.. ");
		int id=sc.nextInt();
		System.out.println("Enter the employe name.. ");
		String name=sc.next();
		System.out.println("Enter the employe department.. ");
		String dep=sc.next();
		System.out.println("Enter the employe salary..");
		int salary=sc.nextInt();
		EmployeP e;
		e=new Employe();
		e.emp();
		e.emp("sham");
		
		System.out.println("------------");
		Employe e1=new Employe();
		e1.setId(id);
		e1.setName(name);
		e1.setDep(dep);
		e1.setSalary(salary);
		
		
	}

}
