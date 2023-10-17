package in.com.Get_Set;

import java.util.Scanner;

public class BikeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bike name : ");
		String bname=sc.next();
		System.out.println("Enter the price : ");
		int bprice=sc.nextInt();
		System.out.println("Enter the bike model :");
		int modale=sc.nextInt();
		Bike b=new Bike(bname, bprice, modale);
		System.out.println("bike name is :"+b.getBname());
		System.out.println("bike price :"+b.getBprice());
		System.out.println("bike modale :"+b.getBmodale());

	}

}
