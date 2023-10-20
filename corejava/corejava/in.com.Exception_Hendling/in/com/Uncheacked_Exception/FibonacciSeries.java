package in.com.Uncheacked_Exception;

import java.util.Scanner;

class FibonacciSeriesException{
	public FibonacciSeriesException(String s) {
		super();
	}
	public FibonacciSeriesException() {
		this("there are Fibonacci series");
	}
	void Fibonacci(int count) {
		
		int n1=0,n2=1,n3;
		System.out.println(n1+" "+n2);
		for (int i = 0; i < count; i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		 }
		}
	}

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count number..");
		int count=sc.nextInt();
		FibonacciSeriesException f=new FibonacciSeriesException("not FibonacciSeries");
		try {
			f.Fibonacci(count);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
