package Arrays;

import java.util.Scanner;

public class PrsentInNumber {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int flage=0;
	System.out.println("Enter the size...");
	int size=sc.nextInt();
	System.out.println("Enter the number arrys..");
	int num[]=new int[size];
	for(int i=0;i<size;i++) {
		num[i]=sc.nextInt();
	}
	
	System.out.println("Search the elements..");
	int s=sc.nextInt();
	
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(num[i]+num[j]==s) {
				flage=1;
			}
		}
	}
	if(flage==1) {
		System.out.println("Elment present in the box..");
	}
	else {
		System.out.println("Element is not present.....");
	}
	
}
}
