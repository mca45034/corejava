package Basic;

import java.util.Scanner;

public class PolindramNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int tmp=0;
		tmp=num;
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(sum == tmp) {
			System.out.println("its polindram number : ");
		} 
		
		else {
			System.out.println("its not polindram");
		}
	}

}
