package Basic;

import java.util.Scanner;

public class FrequencyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		for(int i=0;i<9;i++) {
			int tmp=num;
			int rem=0,count=0;
			while(tmp>0) {
				rem=tmp%10;
				if(rem==i) {
					count++;
				}
				tmp=tmp/10;
			}
			if(count>0) {
			System.out.println(i+" "+count);
			}
		}
		

	}

}
