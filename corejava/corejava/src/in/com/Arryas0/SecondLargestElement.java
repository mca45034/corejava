package in.com.Arryas0;

public class SecondLargestElement {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 32, 55, 67, 43, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}

}
