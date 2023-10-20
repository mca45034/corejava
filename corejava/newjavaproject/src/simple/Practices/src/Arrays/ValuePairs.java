package Arrays;

import java.util.Scanner;

public class ValuePairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size..");
		int size1=sc.nextInt();
		System.out.println("Enter the number...");
		int num1[]=new int [size1];
		for(int i=0;i<size1;i++) {
			num1[i]=sc.nextInt();
		}
		System.out.println("Enter the size..");
		int size2=sc.nextInt();
		System.out.println("Enter the number...");
		int num2[]=new int [size2];
		for(int i=0;i<size1;i++) {
			num2[i]=sc.nextInt();
		}
		System.out.println("Enter the your choice of pairs...");
		int x=sc.nextInt();
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(num1[i]+num2[j]==x) {
					System.out.println("("+num1[i]+""+num2[j]+")");
				}
			}
		}

	}

}
