package Basic;

public class CountEvenIndex {

	public static void main(String[] args) {
		int n=12345;
		int sum=0,count=0;
		while(n>0) {
			int rem=n%10;
			for(int i=0;i<rem;i=i+2) {
				count++;
				sum=sum+rem;
				n=n/10;
			}
			System.out.println(sum);
		}

	}

}
