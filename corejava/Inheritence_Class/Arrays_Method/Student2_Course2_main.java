package Arrays_Method;

import java.util.Scanner;

public class Student2_Course2_main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student2 []s=new Student2[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter the student id..");
			int s_id=sc.nextInt();
			System.out.println("Enter the student name..");
			String s_name=sc.next();
			System.out.println("Enter the coure name..");
			String c_name=sc.next();
			System.out.println("Enter the coure fee...");
			int c_fee=sc.nextInt();
			Cours2 c=new Cours2(c_name, c_fee);
			s[i]=new Student2(s_id, s_name, false, c);
		}
//		for (int i = 0; i < s.length; i++) {
//			if(s[i].c.c_fee>1500) {
//				s[i].isSpceal=true;
//				System.out.println("your are special");
//			}
//			else {
//				System.out.println("youre not special");
//			}
//		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].c.c_name.equalsIgnoreCase("java")) {
				s[i].isSpceal=true;
				System.out.println("Course are avilable");
			}
			else if(s[i].c.c_name.equalsIgnoreCase("c++")) {
				s[i].isSpceal=true;
				System.out.println("Course are avilable");
			}
			else if(s[i].c.c_name.equalsIgnoreCase("php")) {
				s[i].isSpceal=true;
				System.out.println("Course are avilable");
			}
			else if(s[i].c.c_name.equalsIgnoreCase("python")) {
				s[i].isSpceal=true;
				System.out.println("Course are avilable");
			}
			else {
				System.out.println("course not avilable");
			}
			
		}

	}

}
