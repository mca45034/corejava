package Arryas0;

import java.util.Scanner;

public class ReversNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arrys : ");
		int size = sc.nextInt();
		System.out.print("Enter the number of arry : ");
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}

}
