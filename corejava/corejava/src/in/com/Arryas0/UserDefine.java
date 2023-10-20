package in.com.Arryas0;

import java.util.Scanner;

public class UserDefine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arry :");
		int size = sc.nextInt();
		System.out.println("Enter the value of the arrys :");
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.println(num[i]);

		}

	}

}
