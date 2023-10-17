package in.com.Uncheacked_Exception;

import java.util.Scanner;

public class NotEligibleToVote extends Exception {
	void cheak(int age) throws NotEligibleToVote
	{
		if(age<18) {
			
			try {
				throw new NotEligibleToVote();
			} catch (NotEligibleToVote e) {
				System.out.println("not eligible");
			}
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your age :");
		int age=sc.nextInt();
		NotEligibleToVote n=new NotEligibleToVote();
		try {
			n.cheak(age);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
