package String;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34695;
		int max=0;
		
		while(num>0) {
			int count=0;
			int rem=num%10;
			if(num<max) {
				count++;
			}
			//num=num/10;
			
			System.out.println(count);
		}
		
		
	}

}
