package in.com.Lambda_FunctionalInterface;
@FunctionalInterface
interface AddNumber{
	public void disp(int a,int b);
}
public class FunctionInterAdd {

	public static void main(String[] args) {
		AddNumber add=new AddNumber() {
			
			@Override
			public void disp(int a, int b) {
				int sum=a+b;
				System.out.println(sum);
				
			}
		};
		add.disp(23, 23);

	}

}
