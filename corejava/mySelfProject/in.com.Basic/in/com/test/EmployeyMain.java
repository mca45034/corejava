package in.com.test;

import java.sql.SQLException;
import java.util.Scanner;

import in.com.deo.Employeimp;
import in.com.deo.Record;
import in.com.pojo.Employey;

public class EmployeyMain {
	void show() throws SQLException, ClassNotFoundException {
		String ans;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("1 Add Employe");
			System.out.println("2 update Employee");
			System.out.println("3 remove Employee");
			System.out.println("4 view Employee");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			Record r=new Employeimp();
			Employey e;
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter employe id");
				int id=sc.nextInt();
				System.out.println("Enter employe name");
				String name=sc.next();
				System.out.println("Enter employe salary");
				int salary=sc.nextInt();
				System.out.println("Enter employe commsion");
				float comm=sc.nextFloat();
				System.out.println("Enter employe date of joining");
				String d_joining =sc.next();
				
				e=new Employey(id,name,salary,comm,d_joining);
				
				boolean b=r.insert(e);
				if(b==true) {
					System.out.println("record insert sucessfully");
				}
				else
					System.out.println("record does not inserted");
				break;
				
			}
			case 2:
			{
				System.out.println("Enter employe name");
				String name=sc.next();
				System.out.println("Enter employe salary");
				int salary=sc.nextInt();
				System.out.println("Enter employe commsion");
				float comm=sc.nextFloat();
				System.out.println("enter employe date og joining");
				String d_joining=sc.next();
				System.out.println("enter employe id");
				int id=sc.nextInt();
				
				e=new Employey(name,salary,comm,d_joining,id);
				boolean b=r.update(e);
				if(b==true) {
					System.out.println("record update sucessfully");
				}
				else
					System.out.println("record does not update");
				break;
				
			}
			case 3:
			{
				boolean b=r.delete();
				if(b==true) {
					System.out.println("record deleted Sucessfully");
				}
				else
					System.out.println("record does not delete");
				break;
			}
			case 4:
			{
				r.veiw();
				break;
			}
			}
			System.out.println("do you want to continue yes/no");
			ans=sc.next();
			
		}while(ans.equalsIgnoreCase("yes"));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeyMain emp=new EmployeyMain();
		emp.show();
		

	}

}
