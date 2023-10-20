package in.com.Arryas0;

public class FrequncyArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int count = 0;
		System.out.println("Number" + "||" + "frequncy");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// System.out.println(arr[i]);
					count++;
					arr[j] = -1;
				}
			}

			if (arr[i] != -1) {

				System.out.println(arr[i] + "|" + count);
			}

		}

	}

}
