package Uncheacked_Exception;

import java.util.Scanner;

public class BinaryNumberException1 extends RuntimeException{
	BinaryNumberException1(String s)
	{
		super(s);
		
	}
	
	BinaryNumberException1()
	{
		this("not a binay number");
		
	}
	
	void check(int num) 
	{
		int flag=0;
		while(num>0)
		{
			int rem=num%10;
			
			
			if(rem==0 || rem==1)
			{
				flag=1;
			}
			else
			{
				throw new BinaryNumberException1();
			}
			num=num/10;
		}
		
		if(flag==1)
		{
			System.out.println("binary number executed");
		}
		else {
			throw new BinaryNumberException1();
		}
	}
	public static void main(String[] args) {
		BinaryNumberException1 b=new BinaryNumberException1("not  a binary number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number...");
		int num=sc.nextInt();
		//int num=101010;
			try {
				b.check(num);
			} catch (BinaryNumberException1 e) {
				System.out.println("not binary number");
			}
		} 
		
		
		
		
	}


	


