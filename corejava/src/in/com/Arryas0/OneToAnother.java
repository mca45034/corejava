package in.com.Arryas0;

import java.util.Scanner;

public class OneToAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first arry :");
		int size1 = sc.nextInt();
		System.out.println("Enter the vlaue of first arry : ");
		int num1[] = new int[size1];
		int i, j, j1;
		for (i = 0; i < size1; i++) {
			num1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of second arry :");
		int size2 = sc.nextInt();
		System.out.println("Enter the value of second arry : ");
		int num2[] = new int[size2];
		for (j = 0; j < size1; j++) {
			num2[i] = sc.nextInt();

		}
		int arr3[] = new int[size1];

		for (int k = 0; k < arr3.length; k++) {
			arr3[k] = num1[i];
		}
		System.out.println("The first array after swapping is :");
		for (int k = 0; k < arr3.length; k++) {
			System.out.println(arr3[k]);
		}
		int arr4[] = new int[size2];
		for (j1 = 0; j1 < arr4.length; j1++) {
			arr4[j1] = num2[j];
		}

		System.out.println("The first array after swapping is :");
		for (i = 0; i < size1; i++) {
			System.out.println(arr4[j1]);

		}

	}

}
