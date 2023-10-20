package Arrays;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		//int num[]= {7,4,9,10,2,8};
		//Swapping value 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int num[]=new int[size];
		int temp=0;
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		int tmp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]>num[j]) {
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		}
		


	}

}
