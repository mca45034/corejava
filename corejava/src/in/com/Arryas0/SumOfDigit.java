package in.com.Arryas0;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int a[] = { 6, 4, 2, 8, 2, 5, 0, 7, 0, 3, 9, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("some of the number enter : ");
		int pair = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (pair == a[i] + a[j]) {
					sum = a[i] + a[j];
					System.out.println(a[i] + " + " + a[j] + " = " + sum);
				}

			}

		}
	}

}
