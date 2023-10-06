package Uncheacked_Exception;

import java.util.Scanner;

public class Array_Exception extends RuntimeException {
	public Array_Exception() {
		super();
	}
	void search(int s) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int flage=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==s) {
				flage=1;
			}
		}
		if(flage==1) {
			System.out.println( "number is present "+s);
		}
		else {
			throw new Array_Exception();
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("search the number");
		int s=sc.nextInt();
	 Array_Exception a=new Array_Exception();
	 try {
		a.search(s);
	} catch (Array_Exception e) {
		System.out.println("this element not present ");
	}
		

	}

}
