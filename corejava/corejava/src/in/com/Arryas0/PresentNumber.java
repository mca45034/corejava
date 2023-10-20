package in.com.Arryas0;

import java.util.Scanner;

public class PresentNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Search the number : ");
		int s = sc.nextInt();
		int flage = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == s) {
				flage = 1;

			}
		}
		if (flage == 1) {
			System.out.println(s + " -: number is present ");
		} else {
			System.out.println("----- !!! Please choose the right number");
		}

	}

}
