package in.com.Arryas0;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
//		int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
//		Arrays.parallelSort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
//		}
    int[] arr = { 100, 1, 2, 50, 30, 25, 40};
		
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			
			System.out.println(i);
			
		}
	}
}
