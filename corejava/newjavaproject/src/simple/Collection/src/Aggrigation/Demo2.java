package Aggrigation;

import java.util.Scanner;

public class Demo2 {
	public static void revers(String str) {
		int arr[]= {2,3,4,5,6,10,12};
		Scanner sc=new Scanner(System.in);
		System.out.println("Search the elements : ");
		int s=sc.nextInt();
		int flage=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==s) {
					flage=1;
				}
			}
		}
		if(flage==1) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		
	}
}


