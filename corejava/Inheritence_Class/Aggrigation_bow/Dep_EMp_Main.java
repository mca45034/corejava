package Aggrigation_bow;

import java.util.Scanner;

public class Dep_EMp_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employe id... ");
		int id=sc.nextInt();
		System.out.println("Enter the employe name.. ");
		String name=sc.next();
		System.out.println("Enter the Empolye salary.. ");
		int salary=sc.nextInt();
		
		System.out.println("Enter the department id..");
		int depId=sc.nextInt();
		System.out.println("Enter the department name is..");
		String depName=sc.next();
		Employe e=new Employe();
		e.setId(depId);
		e.setName(depName);
		e.setSalary(salary);
		Department d=new Department();
		e.setD(d);
		e.getD().setDepId(depId);
		e.getD().setDepName(depName);
		e.disp2();
		e.getD().disp1();
		

	}

}
