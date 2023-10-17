package in.com.Basic;

import java.util.Scanner;

public class Movies_Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name..");
		String name=sc.next();
		System.out.println("Enter the price..");
		double price=sc.nextInt();
		System.out.println("Enter the code..");
		int code=sc.nextInt();
		System.out.println(" !!! wel come to inoxe !!!");
		if(code==9211) {
			price=price-(price*0.8f);
			System.out.println(name);
			System.out.println(" congratulation after discount is.."+price);
		}
		else if(code==1899) {
			price=price-price*0.05f;
			System.out.println(name);
			System.out.println(" congratulation after discount is.."+price);
			
		}
		else {
			System.out.println("please collect the ticket....");
		}

	}

}
