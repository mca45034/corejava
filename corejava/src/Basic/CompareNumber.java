package Basic;

import java.util.Scanner;

public class CompareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value A :");
		int a=sc.nextInt();
		System.out.println("Enter the value B : ");
		int b=sc.nextInt();
		System.out.println("Enter the value c : ");
		int c=sc.nextInt();
		if(a>b && a>b) {
			System.out.println(" A is greater ");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater ");
		}
		else {
			System.out.println("C is greater");
		}

	}

}
