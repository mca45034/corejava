package Uncheacked_Exception;
class ArmStrongNumberException {
	public ArmStrongNumberException(String s) {
		super();
	}
	public ArmStrongNumberException() {
		this("Not a armstrong number");
	}
	void Number(int num) {
		
		int sum=0;
		int tmp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(tmp==sum) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
	}
	
}

public class ArmStrongNumber {

	public static void main(String[] args) {
		ArmStrongNumberException arm=new ArmStrongNumberException("not");
		int num=158;
		try {
			arm.Number(num);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
