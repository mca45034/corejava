package in.com.Basic;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number : ");
		double num2=sc.nextDouble();
		System.out.println("Enter the opreter + - * / ");
		char choice=sc.next().charAt(0);
		double result;
		switch(choice) {
		case '+' :
			result=num1+num2;
			System.out.println("value is : "+result);
			break;
		case '-' :
			result=num1-num2;
			System.out.println("value is : "+result);
			break;
			
		case '*' :
			result=num1*num2;
			System.out.println("value is : "+result);
			break;
			
		case '/' :
			result=num1/num2;
			System.out.println("value is : "+result);
			break;
			
		default :
			System.out.println("Please enter the correct choice");
			
		}
		
	}

}
