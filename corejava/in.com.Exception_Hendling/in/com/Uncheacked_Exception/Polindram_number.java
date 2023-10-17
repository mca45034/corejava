package in.com.Uncheacked_Exception;

import java.util.Scanner;

class PolindramNumberException extends RuntimeException{
	public PolindramNumberException() {
		super("i am constructer");
	}
	void polindram (int num) {
		int sum=0;
		int rem=0;
		int tmp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(tmp==sum) {
			System.out.println("polindram");
		}
		else {
			throw new PolindramNumberException();
		}
	}
}

public class Polindram_number {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		PolindramNumberException p=new PolindramNumberException();
	
		try {
			p.polindram(num);
		} catch (RuntimeException e) {
			System.out.println("not polindram");
		}

	}

}
