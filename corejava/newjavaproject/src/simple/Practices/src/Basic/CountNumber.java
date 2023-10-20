package Basic;

public class CountNumber {

	public static void main(String[] args) {
	int num=12345;
	int sum=0,count=0;
	while(num>0) {
		int rem=num%10;
		count++;
		num=num/10;
		sum=sum+rem;
	}
	System.out.println(count);
	System.out.println(sum);
	}

}
