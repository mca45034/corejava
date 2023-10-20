package Core_java;

public class Question8 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int k=2;k>=i;k--) {
				System.out.print("");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
				//System.out.println(" ");
			}
			System.out.print("\n");
		}
	}

}
