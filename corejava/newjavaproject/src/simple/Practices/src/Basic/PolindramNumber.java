package Basic;

import java.util.Scanner;

public class PolindramNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ...");
		int num=sc.nextInt();
		int rem=0,tmp=0,sum=0;
		tmp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(tmp==sum) {
			System.out.println("Polindram");
		}
		else {
			System.out.println("not polindram");
		}
	}
}
