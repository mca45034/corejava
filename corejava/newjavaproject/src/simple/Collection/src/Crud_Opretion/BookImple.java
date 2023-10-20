package Crud_Opretion;

import java.util.ArrayList;
import java.util.Scanner;

public class BookImple implements Operation {
	Scanner sc=new Scanner(System.in);
	boolean flage=false;
	int count=0;
	int id = 0;
	int flag=0;
	ArrayList<BookPojo> al=new ArrayList<>();
   BookPojo b=null;
	@Override
	public boolean insert() {
		System.out.println("1.Add book");
		System.out.println("Enter the book id...");
		int id=sc.nextInt();
		System.out.println("Enter the book name...");
		String name=sc.next();
		System.out.println("Enter the book price...");
		float price=sc.nextFloat();
		b=new BookPojo(id,name,price);
		count++;
		al.add(b);
		flage=true;
		
		return flage;
		
	}

	@Override
	public boolean update() {
		
		
		System.out.println("2.update book:");
		System.out.println("enter the book id for update:");
		int bookid=sc.nextInt();
		       if(b !=null && b.getId()==id) {
				System.out.println("enter the bookname for update:");
				String name=sc.next();
				
				b.setName(name);
				System.out.println("enter the book prize for update:");
				int prize=sc.nextInt();
				b.setPrice(prize);
		       }
				
		al.add(b);
		flage=true;
		
		return flage;
	}

	@Override
	public boolean delete() {
		System.out.println("delete book:");
		System.out.println("enter the bookid for delete:");
		 id=sc.nextInt();
		 if(b !=null && b.getId()==id) {
			 b=null;
		 }
		 al.add(b);
		 flage=true;
		return flage;
	}

	@Override
	public boolean search() {
		System.out.println("search book:");
		System.out.println("enter the bookid for search :");
		id=sc.nextInt();
        System.out.println("bookid  "+"\t"+"bookname  "+"\t"+"prize  ");
        if(b !=null && b.getId()==id) {
			flag=1;
		 }
        if(flag==1)
		{
			System.out.println(b);
		}
        al.add(b);
        flage=true;
		return flage;
	}

	@Override
	public void show_details() {
		System.out.println("all info book:");
		
		System.out.println("all book are:");
		System.out.println("bookid  "+"\t"+"bookname "+"\t"+"prize  ");
		if(b !=null)
		{
			
			
	System.out.println(b);	
			
				
	}
		
		
	}

	@Override
	public void exit() {
		System.exit(0);
		
	}

}
