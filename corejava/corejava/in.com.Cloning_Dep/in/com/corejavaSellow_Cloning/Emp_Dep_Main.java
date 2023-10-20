package in.com.corejavaSellow_Cloning;

import java.util.Scanner;

class Dep implements Cloneable{
	int d_id;
	String d_name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class Emp implements Cloneable
{
	int e_id;
	String e_name;
	Dep d=new Dep();
	public Emp(int e_id,String e_name,int d_id,String d_name) {
		this.e_id=e_id;
		this.e_name=e_name;
		this.d.d_id=d_id;
		this.d.d_name=d_name;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Emp e=(Emp) super.clone();
		e.d=(Dep) d.clone();
		return e;
	}
	
}
public class Emp_Dep_Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employe id...");
		int e_id=sc.nextInt();
		System.out.println("Enter Employe name..");
		String e_name=sc.next();
		System.out.println("Enter depart id...");
		int d_id=sc.nextInt();
		System.out.println("Enter depart name...");
		String d_name=sc.next();
		
		Emp e=new Emp(e_id,e_name, d_id,d_name);
		Emp e1=(Emp) e.clone();
		System.out.println("Enter employe id..");
		e.e_id=sc.nextInt();
		System.out.println("Enter employe name..");
		e.e_name=sc.next();
		System.out.println("Enter department id...");
		e.d.d_id=sc.nextInt();
		System.out.println("enter department name....");
		e.d.d_name=sc.next();
		System.out.println(e.e_id);
		System.out.println(e.e_name);
		System.out.println(e.d.d_id);
		System.out.println(e.d.d_name);
		
		System.out.println("----------");
		System.out.println(e1.e_id);
		System.out.println(e1.e_name);
		System.out.println(e1.d.d_id);
		System.out.println(e1.d.d_name);

	}

}
