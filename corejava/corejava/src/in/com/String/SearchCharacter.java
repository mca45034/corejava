package in.com.String;

import java.util.Scanner;

public class SearchCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="java programming";
		System.out.println("Search the character....");
		char s=sc.next().charAt(0);
		int flage=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(s==ch[i]) {
				flage=1;
			}
		}
		if(flage==1) {
			System.out.println("this charecter is present...");
		}
		else {
			System.out.println("not present");
		}
		
		

	}

}
