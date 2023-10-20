package Basic;

public class Prime100 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			int flage=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flage=1;
				}
			}
			if(flage==0) {
				System.out.println(i);
			}
			else {
				System.out.println(i);
			}
		}
		
		

	}

}
