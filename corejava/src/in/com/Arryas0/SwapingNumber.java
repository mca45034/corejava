package in.com.Arryas0;

public class SwapingNumber {
	public static void main(String[] args) {
		int a[] = { 323, 786, 1231, 5, 221, 32 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
