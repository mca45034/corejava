package simple;
import java.util.Scanner;
public class search_leap_year {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the YEAR :: ");
		int year = in.nextInt();
		if((year % 4== 0)&& (year % 100! = 0)||(year % 400 == 0))
		{
			System.out.println("this is a LEAP YEAR : ");
			
		}
		else 
			System.out.println("this is  NOT a LEAP YEAR : ");
			
	}

}
