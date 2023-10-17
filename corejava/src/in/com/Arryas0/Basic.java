package in.com.Arryas0;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arry size..");
		int size=sc.nextInt();
		System.out.println("Enter the value");
		int []num=new int[size];
		for (int i = 0; i < size; i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the value..");
		int s=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(num[i]==s) {
				System.out.println(i);
			}
		}

	}

}
