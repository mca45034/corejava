package Incapsulation12;

import java.util.Scanner;

public class Employe_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :");
		int id=sc.nextInt();
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter salary :");
		double salary=sc.nextDouble();
//		System.out.println("Enter the pf");
//		double pf=sc.nextDouble();
		Employe emp=new Employe();
		emp.setEmployeid(id);
		emp.setEmployeName(name);
		emp.setSalary(salary);
		//emp.setNetSalary(pf);
		System.out.println("Id :"+emp.getEmployeid());
		System.out.println("Name :"+emp.getEmployeName());
		System.out.println("Salary :"+emp.getSalary());
		double netSalary=salary-salary*0.05f;
		System.out.println("After pf reduse");
		System.out.println("netSalary :"+netSalary);

	}

}
