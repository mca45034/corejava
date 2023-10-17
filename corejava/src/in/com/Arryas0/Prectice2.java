package in.com.Arryas0;

import java.util.Scanner;

public class Prectice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		System.out.print("Enter the value ");
		int num[] = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();

		}
		int flage = 0;
		System.out.print("search the elemnt ");
		int s = sc.nextInt();
		for (int i = 0; i < size; i++) {
			// System.out.println(num[i]);
			if (num[i] == s) {
				flage = 1;
			}

		}
		if (flage == 1) {
			System.out.println("presnet");
		} else {
			System.out.println("not present");
		}
	}

}
