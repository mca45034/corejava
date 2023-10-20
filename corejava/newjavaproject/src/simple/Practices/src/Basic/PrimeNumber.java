package Basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		int flage=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flage=1;
				
			}
		}
		if(flage==0) {
			System.out.println("prime number..");
		}
		else {
			System.out.println("Not prime number...");
		}
	}
}
