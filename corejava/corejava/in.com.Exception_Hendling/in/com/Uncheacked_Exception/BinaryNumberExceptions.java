package in.com.Uncheacked_Exception;

public class BinaryNumberExceptions extends RuntimeException{
	public BinaryNumberExceptions(String s) {
		super();
	}
	public BinaryNumberExceptions() {
		this("not a binary number");
	}
	void Cheak(int num) {
		int flage=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			if(rem==0 || rem==1) {
				flage=1;
			}
			else {
				throw new BinaryNumberExceptions();
			}
			num=num/10;
		}
		if(flage==1) {
			System.out.println("biunary number excuted");
		}
		else {
			throw new BinaryNumberExceptions("not a binary number");
		}
		
	}

	public static void main(String[] args) {
		BinaryNumberExceptions b=new BinaryNumberExceptions();
		int num=101001121;
		try {
			b.Cheak(num);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
