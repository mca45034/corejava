package in.com.Uncheacked_Exception;

import java.util.Scanner;

public class FebonacciSeriesExceptions extends RuntimeException{
	void cheak(int num) throws FebonacciSeriesExceptions{
		int n1=0,n2=1,n3;
		System.out.println(n1+" "+n2);
		for (int i = 0; i < num; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

	public static void main(String[] args) {
		FebonacciSeriesExceptions f=new FebonacciSeriesExceptions();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number...");
		int num=sc.nextInt();
		try {
			f.cheak(num);
		} catch (FebonacciSeriesExceptions e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
