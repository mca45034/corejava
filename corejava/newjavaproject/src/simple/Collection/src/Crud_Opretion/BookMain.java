package Crud_Opretion;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Operation o=new BookImple();
		do
		{
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Search");
			System.out.println("5.Show_Details");
			System.out.println("6.Exit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			boolean bol=o.insert();
			if(bol==true)
			{
				System.out.println("record inserted succesfully");
			}
			
				break;
			case 2:
				boolean bol1=o.update();
				if(bol1==true)
				{
					System.out.println("record updating succesfully");
				}
				break;
			case 3:
				boolean bol2=o.delete();
				if(bol2==true)
				{
					System.out.println("record deleting succesfully");
				}
				break;
			case 4:
				break;
				
			}

		}while(choice!=4);	
		
		
		

	}

}
