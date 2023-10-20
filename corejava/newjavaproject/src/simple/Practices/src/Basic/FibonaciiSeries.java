package Basic;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int a=0,b=1,sum=0;
		System.out.println(a+" "+b);
		for(int i=2;i<num;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
		
		

	}

}
