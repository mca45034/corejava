package in.com.Arryas0;

public class UniunEntersation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 5, 7 };
		int a1[] = { 2, 3, 5, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (a[i] == a1[j]) {
					System.out.print(" " + a[i] + "");
			
				}

			}

		}
		

	}

}
