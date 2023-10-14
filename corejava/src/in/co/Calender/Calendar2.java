package in.co.Calender;

import java.util.Scanner;

public class Calendar2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year..");
		int year=sc.nextInt();
		
		System.out.println("Enter the month..");
		int month=sc.nextInt();
		while(month !=0) {
			
		if(month==01 || month==03 ||  month==05 || month==07 || month== 8 || month==10 ||month==12) {
			System.out.println("year of....: "+year);
			for (int i = 1; i <=31; i++) {
				System.out.print(i+" ");
				
			}
			
			break;
			
		}
		else if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("year of....: "+year);
			for (int i = 1; i <=30; i++) {
				System.out.print(i+" ");
				
			}
			
			break;
		}
		else {
			System.out.println("year of....: "+year);
			for (int i = 1; i <= 28; i++) {
				System.out.print(i+" ");
				
				
			}
			break;
			
		}
			
		}
		


	}

}
