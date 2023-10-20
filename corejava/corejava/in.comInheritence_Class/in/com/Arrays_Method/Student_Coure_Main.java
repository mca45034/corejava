package in.com.Arrays_Method;

import java.util.Scanner;

public class Student_Coure_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[2];
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter the student id...");
			int s_id=sc.nextInt();
			System.out.println("Enter the student name..");
			String s_name=sc.next();
			System.out.println("Enter the course name..");
			String c_name=sc.next();
			System.out.println("Enter the coure fee..");
			int c_fee=sc.nextInt();
			Course c=new Course(c_name, c_fee);
			s[i]=new Student(c_fee, c_name, false, c);
		}
			for (int i = 0; i < s.length; i++) {
				if(s[i].c.c_fee>5000) {
					s[i].isSpecial=true;
					System.out.println("Student is Special");
				}
				else {
					System.out.println("not special..");
				}
			}
		}

	}


