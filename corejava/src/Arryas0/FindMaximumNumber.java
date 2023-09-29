package Arryas0;

public class FindMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 43, 12, 34, 65, 77, 54, 11 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println(max);

	}

}
