package Arrays;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum of the value...");
		int a[]= {6,4,2,8,2,5,5,7,3,9,1};
		int pair=sc.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==pair) {
					sum=a[i]+a[j];
					System.out.println(a[i]+"+"+a[j]+"="+sum);
				}
				
			}
		}
		

	}

}
