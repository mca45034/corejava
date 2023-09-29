package Get_Set;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employe id : ");
		int id=sc.nextInt();
		System.out.println("Enter the employe name : ");
		String name=sc.next();
		System.out.println("Enter the employe age : ");
		int age=sc.nextInt();
		System.out.println("Enter the employe salary : ");
		int salary=sc.nextInt();
		Employe emp=new Employe();
		emp.setId(id);
		emp.setName(name);
		emp.setAge(age);
		emp.setSalary(salary);
		
		emp.display();
		
//		System.out.println("Employe id is : "+emp.getId());
//		System.out.println("Employe name is : "+emp.getName());
//		System.out.println("Enter the age : "+emp.getAge());
//		System.out.println("Enter the salary : "+emp.getSalary());
		

	}

}
