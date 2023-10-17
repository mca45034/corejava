package in.com.Arryas0;

public class FindMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 43, 12, 34, 65, 77, 54, 11 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println(min);

	}

}
