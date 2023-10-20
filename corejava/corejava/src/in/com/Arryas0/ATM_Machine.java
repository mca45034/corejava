package in.com.Arryas0;

import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=1000;
		int pin=1234;
		System.out.println(" Enter the username :");
		String username=sc.next();
		System.out.println(" Enter youre pin... : ");
		int u_pin=sc.nextInt();
		System.out.println(" !!! WELCOME TO BOI !!!");
		System.out.println("WELCOME ......."+username);
		int choice=0;
		if(pin==u_pin) {
		do {
			System.out.println(" 1 WITHDROW");
			System.out.println(" 2 DEPOSITE");
			System.out.println(" 3 CHECK BALANCE");
			System.out.println(" 4 EXIT");
			
			System.out.println(" !!! Enter youre choice !!!");
			 choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println(" !!! withdrow amount !!!");
				int withdrow=sc.nextInt();
				if(withdrow>balance) {
					System.out.println("!! Insufficent balance !!");
				}
				else {
					balance=balance-withdrow;
					System.out.println("!! succesfully withdrow amount !!");
					System.out.println(" !! please check withdrow !!");
				}
				break;
			}
			case 2:{
				System.out.println(" !! Enter the amount !! ");
				int dep=sc.nextInt();
				
				balance=balance+dep;
				
				System.out.println(" !! succesfully deposite your amount !!");
				System.out.println("!! check amount after deposite !!");
				break;
			}
			case 3:{
				System.out.println(" your balance...... : "+balance);
				break;
			}
			case 4:{
				System.exit(0);
			}
			}
		}while(choice != 4);
		}
		else {
			System.out.println("please check your pin..");
			
		}

	}

}
