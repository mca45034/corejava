package Arrays;

import java.util.Scanner;

public class PrintOddNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size..");
		int size=sc.nextInt();
		System.out.println("Enter the number...");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			if(num[i]%2 !=0) {
				System.out.println("Odd elements is..."+num[i]);
				sum=num[i]+1;
				System.out.println(sum);
			}
			
		}
	}
}
