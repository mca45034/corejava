package Arrays_Method;

import java.util.Scanner;

public class Stu_Cou_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of details student....");
		int size=sc.nextInt();
		Student1 []s=new Student1[size];
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the student id...");
			int s_id=sc.nextInt();
			System.out.println("Enter the student name..");
			String s_name=sc.next();
			System.out.println("Enter the course name....");
			String c_name=sc.next();
			System.out.println("Enter the coure fee...");
			int c_fee=sc.nextInt();
			Course1 c=new Course1(c_name, c_fee);
			s[i]=new Student1(c_fee, c_name,false, c);
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].c.c_name.equalsIgnoreCase("java")) {
				s[i].isSpceal=true;
				System.out.println("Core java book is availeble");	
			}
			else if(s[i].c.c_name.equalsIgnoreCase("c++")) {
				s[i].isSpceal=true;
				System.out.println("c++ book is availeble");
			}
			else if (s[i].c.c_name.equalsIgnoreCase("php")) {
				s[i].isSpceal=true;
				System.out.println("php book is availeble");
			}
			else if (s[i].c.c_name.equalsIgnoreCase("python")) {
				s[i].isSpceal=true;
				System.out.println("python book is availeble");
			}
			else {
				System.out.println("not availeble book..");
			}
		}
		

	}

}
