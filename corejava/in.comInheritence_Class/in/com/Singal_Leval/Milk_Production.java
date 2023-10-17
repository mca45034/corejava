package in.com.Singal_Leval;

import java.util.Scanner;

class Animal {
	void display(String s) {
		System.out.println("welcome to..."+s);
	}
	void Discount() {
		System.out.println("there are diwali offer big deal milk discount..");
	}
}
class Buffelo extends Animal {
	float price=0;
	void Discount() {
		super.Discount();
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Buffelo milk is there..");
		System.out.println(" 1..Amul milk...80");
		System.out.println(" 2..sanchi milk...60");
		System.out.println("Enter your choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=80;
			cal_discount();
			break;
			
		case 2:
			price=60;
			cal_discount();
			break;
		}
	}
	void cal_discount () {
		System.out.println("are giving 10 % descount in buffelo milk..");
		price=price-price*0.10f;
		System.out.println("After discount you pay now... : "+price);
		System.out.println("thankyou you are safe and helthy...");
	}
}

class Cow extends Animal{
	float price=0;
	void Discount() {
		super.Discount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Cow milk is there...");
		System.out.println(" 1..Amule milke..55");
		System.out.println(" 2..Mother Dairy milk..40");
		System.out.println("Enter youre choice..");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			price=55;
			Cal_discount();
			break;
		case 2: 
			price=40;
			Cal_discount();
			break;
			
		}
	}
	void Cal_discount() {
		System.out.println("are giving 5% descount in cow milk..");
		price=price-price*0.05f;
		System.out.println("After discount you pay now... : "+price);
		System.out.println("");
	}
}


public class Milk_Production {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice buy milk...");
		System.out.println(" 1..Buffelo");
		System.out.println(" 2..Cow");
		System.out.println(" enter youre choice type (Buffelo & Cow ) only one animal type");
		String s=sc.next();
		Animal a;
		if(s.equalsIgnoreCase("Buffelo")) {
			a=new Buffelo();
			a.display("Buffelo Milk");
			a.Discount();
		}
		else {
			a=new Cow();
			a.display("Cow Milk ");
			a.Discount();
		}
		
		

	}

}
