package in.com.Basic;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of avg...");
		int num=sc.nextInt();
		int sum=0,count=0,avg1,avg2,sum1=0,count1=0;
//		for (int i = 1; i <=num; i++) {
//			if(i%2==0) {
//				sum=sum+i;
//				count++;
//			}	
//		}
		for (int j = 1; j <=num; j++) {
			if(j%2!=0) {
				sum1=sum1+j;
				count1++;
			}	
		}
		
		avg1=sum/count;
		avg2=sum1/count1;
		System.out.println(avg1);
		System.out.println("------------");
		System.out.println(avg2);

	}

}
