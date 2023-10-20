package Basic;

import java.util.Scanner;

public class MinimumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		int min=num%10;
		num=num/10;
		while(num>0) {
			int rem=num%10;
			if(rem<min) {
				min=rem;
			}
			num=num/10;
		}
		System.out.println(min);
	}
}
