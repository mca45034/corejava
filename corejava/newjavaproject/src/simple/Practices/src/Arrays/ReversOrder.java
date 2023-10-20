package Arrays;

import java.util.Scanner;

public class ReversOrder {

	public static void main(String[] args) {
//		int num[]= {2,3,4,5,6,7,8};
//		int i = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.println(num[i]);
		}

	}

}
