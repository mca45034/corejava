package Basic;

public class DigitPrimNumber {

	public static void main(String[] args) {
		int num=12345;
		int rem=0;
		while(num>0) {
			int flage=0;
			 rem=num%10;
			for(int i=2;i<rem;i++) {
				if(rem%i==0) {
					flage=1;
				}
				num=num/10;
			
			if(flage==0) {
			System.out.println(rem);
			//break;
			}
			}
		}
		
	}

}
