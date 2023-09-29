package Incapsulation12;

import java.util.Scanner;

public class TestBook_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book name...:");
		String bookname=sc.next();
		System.out.println("Enter the price...:");
		int price=sc.nextInt();
		System.out.println("Enter the book authore name ....:");
		String authore=sc.next();
		Book b=new Book();
		b.setBookName(bookname);
		b.setBookPrice(price);
		b.setAuthorName(authore);
		b.Display();
		
	}

}
