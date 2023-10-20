package march1;

public class Question7 {

	public static void main(String[] args) {
	
		
		for(int i=5;i>=0;i--) {
			int a=1;
			for(int k=2;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a++);
				System.out.print(" ");
			}
			System.out.print("\n");
		}

	}

}
