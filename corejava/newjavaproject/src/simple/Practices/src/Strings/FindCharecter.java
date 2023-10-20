package Strings;

import java.util.Scanner;

public class FindCharecter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="by the end athinth century the revolution took please this time in hence franch";
		char ch[]=s.toCharArray();
		int count=0,flage=0;
		System.out.println("Serach the charecter...");
		char ch1=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch1==ch[i]) {
				count++;
				flage=1;
				
			}
		}
		if(flage==1) {
			System.out.println("Total number of charecter... "+count);
		}
		else {
			System.out.println("plese search again..sorry");
		}

	}

}
