package in.com.Basic;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	//int num=171,371;
	int rem,sum=0;
	int tmp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	//System.out.println(sum);
	if (tmp==sum) {
		System.out.println("this is armstronger number");
		
	}
	else {
		System.out.println("its not armstronger number");
	}
}
}
