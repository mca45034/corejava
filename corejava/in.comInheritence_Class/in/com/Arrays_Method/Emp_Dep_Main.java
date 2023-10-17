package in.com.Arrays_Method;

import java.util.Scanner;

public class Emp_Dep_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of employe...");
		int size=sc.nextInt();
		Employe []e=new Employe[size];
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter Employe id...");
			int e_id=sc.nextInt();
			System.out.println("Enter Employe name..");
			String e_name=sc.next();
			System.out.println("Enter department name....");
			String d_name=sc.next();
			System.out.println("Enter the slary...");
			int d_fee=sc.nextInt();
			Department d=new Department(d_name, d_fee);
			e[i]=new Employe(e_id,e_name, false, d);
		}
		for (int i = 0; i < e.length; i++) {
			if(e[i].d.d_name.equalsIgnoreCase("it")) {
				e[i].isSpecial=true;
				System.out.println("Departmnet is availebale");
			}
			else if(e[i].d.d_name.equalsIgnoreCase("hr")) {
				e[i].isSpecial=true;
				System.out.println("department is availeble");
			}
			else if(e[i].d.d_name.equalsIgnoreCase("testing")) {
				e[i].isSpecial=true;
				System.out.println("department is availeble");
			}
			else {
				System.out.println("Department is not availeble");
			}
		}
		for (int i = 0; i < e.length; i++) {
			if(e[i].d.d_fee>35000) {
				e[i].isSpecial=true;
				System.out.println("you are  special...");
			}
			else {
				System.out.println("you are not special...");
			}
		}

	}

}
