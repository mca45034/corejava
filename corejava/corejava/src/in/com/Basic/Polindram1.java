
package in.com.Basic;

public class Polindram1 {

	public static void main(String[] args) {
		int count=0;
		int num;
		for (int i = 1000; i < 10000; i++) {
		int sum=0;
	
		num=i;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;	
		}
		if(i==sum) {
			//System.out.println(i);
			count++;
		}
		
	}
		System.out.println("total count.. "+count);
	
	}

}
