package comPassword;

import java.util.Scanner;

public class Login_Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username...");
		String username=sc.next();
		System.out.println("Enter the Strong passoward...");
		String passward=sc.next();
		char ch[]=passward.toCharArray();
		int flage=0;
		int count=0;
		int charCount=0;
		if(passward.length()<8) {
			System.out.println("passward must be 8 char required");
			flage=1;
		}
		if(passward.contains(" ")) {
			System.out.println("Not space allowed..");
			flage=1;
		}
		if(! passward.contains("@") || passward.contains("#")) {
			System.out.println("atleas one Special charecter required...");
			flage=1;
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>'0' && ch[i]<'9') {
				count=1;
			}
		}
		if(count==0) {
			System.out.println("Atleast one number digit required..");
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=95) {
				charCount=1;
			}
		}
		if(charCount==0) {
			System.out.println("Atleast one Uppercase required..");
		}
		if(flage==0) {
			System.out.println("username is.... : "+username);
			System.out.println("passward is... :"+passward);
		}
		

	}

}
