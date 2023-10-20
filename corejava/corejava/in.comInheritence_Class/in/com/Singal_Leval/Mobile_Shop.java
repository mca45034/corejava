package in.com.Singal_Leval;

import java.util.Scanner;

class Shop{
	public void mobile() {
		System.out.println("Wel come to shope");
		System.out.println("diwali discount....10%");
		
	}
}
class Admin extends Shop{
	String name;
	String choice;
	double price;
	double Dis;
	public Admin(String name, String choice, double price) {
		
		this.name = name;
		this.choice = choice;
		this.price = price;
	}
	public void discount(){
		Dis=price-price*0.10f;
		System.out.println("Customer name .....: "+name);
		System.out.println("youre choice mobile....."+choice);
		System.out.println("Enter the mobile price..."+price);
		System.out.println("Discount after pay now....."+Dis);
		
	}
	
}

public class Mobile_Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name...");
		String name=sc.next();
		System.out.println("your mobile choice....");
		String choice=sc.next();
		System.out.println("Enter mobile price...");
		int price=sc.nextInt();
		Admin a=new Admin(name, choice, price);
		a.discount();

	}

}
