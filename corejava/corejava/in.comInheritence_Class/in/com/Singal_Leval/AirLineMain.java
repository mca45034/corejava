package in.com.Singal_Leval;

import java.util.Scanner;
class Airlines
{
	void display(String s)
	{
		System.out.println("welecome to "+s);
	}
	
	void discount()
	{
		System.out.println("providing discount as per airlines");
	}
}

class Indigo extends Airlines
{
	float price=0;

	void discount()
	{
		super.discount();
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" 1..Mumbai to Delhi----  5000");
		System.out.println(" 2..Mumbai to Banglore----  7000");
		System.out.println(" Enter your choice");
		int choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
			price=5000;
			cal_discount();
			break;
		case 2:
			price=7000;
			cal_discount();
			break;
		
		}
		
		
		
	}
	void cal_discount()
	{
		System.out.println(" we  are giving 5% discount on ur tickets");
		price=price-price*0.05f;
		System.out.println("after discount ur ticket price is...."+price);
		System.out.println("Thank you Have a safe journey");
	}
	
	
}


class AirArabia extends Airlines
{
	float price=0;
	
	void discount()
	{
		super.discount();
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" 1..Mumbai to Dubai----  10000");
		System.out.println(" 2..Mumbai to AbuDhabi----  12000");
		System.out.println(" Enter your choice");
		int choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
			price=10000;
			cal_discount();
			break;
		case 2:
			price=12000;
			cal_discount();
			break;
		
		}
		
		
		
	}
	void cal_discount()
	{
		System.out.println(" we are giving 3% discount on ur tickets");
		price=price-price*0.10f;
		System.out.println("after discount ur ticket price is...."+price);
		System.out.println("Thank you Have a safe journey");
	}
	
	
}


public class AirLineMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Indigo");
		System.out.println("2.Air Arabia");
		String s=sc.next();
		Airlines a;
		if(s.equalsIgnoreCase("indigo"))
		{
		 a=new Indigo();
		a.display("Indigo Airlines");
		a.discount();
		}
		else
		{
		
		a=new AirArabia();
		a.display("Air Arabia Airlines");
		a.discount();
		}
		
	}

}
