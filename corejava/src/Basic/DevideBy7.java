package Basic;

import java.util.Scanner;

public class DevideBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num=sc.nextInt();
		System.out.println("choose your limit : ");
		int limit=sc.nextInt();
		//int num=7;
		int count=0,sum=0;
		for (int i = 1; i < limit; i++) {
			if(i%num==0) {
				count=i;
				System.out.println(count);
			}
			sum=sum+i;
			
		}
		System.out.println(num+" "+"Sum of "+":"+sum);

	}

}
