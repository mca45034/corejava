package in.com.Arryas0;

import java.util.Scanner;

public class UserDefineSortArry {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of arrays...");
//		int size=sc.nextInt();
		int flage=0;
//		int count=0;
//		int num[]=	new int[size];
//		for (int i = 0; i < size; i++) {
//			num[i]=sc.nextInt();
//			
//		}
		int num[]= {1,7,3,4,5};
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				if(num[i]>num[j]) {
					int tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
					flage=1;
					//count++;
					
				}
				
				
			}
			
			
		}
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]==num[i]) {
				flage=1;
			}
			
		}
		if(flage==1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		

	}

}
