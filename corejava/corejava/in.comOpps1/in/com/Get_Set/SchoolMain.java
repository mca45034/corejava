package in.com.Get_Set;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the School room : ");
		int room=sc.nextInt();
		System.out.println("Enter the School staff : ");
		int staff=sc.nextInt();
		System.out.println("Enter the School principal name : ");
		String principal=sc.next();
		System.out.println("Enter the School bus : ");
		int bus=sc.nextInt();
		System.out.println("Enter the total student in school : ");
		int student=sc.nextInt();
		School s=new School(room, staff, principal, bus, student);
		s.Display1();

	}

}
