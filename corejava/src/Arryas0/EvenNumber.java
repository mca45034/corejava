package Arryas0;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int size = sc.nextInt();
		System.out.println("Enter the value :");
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
	}

}
