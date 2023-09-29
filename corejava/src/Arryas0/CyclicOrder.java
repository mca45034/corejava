package Arryas0;

import java.util.Scanner;

public class CyclicOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	      int n = arr.length;
	      int last, i;
	      last = arr[n-1];
	      for (i = n-1; i > 0; i--)
	      arr[i] = arr[i-1];
	      arr[0] = last;
	      System.out.print("The rotated Array is: ");
	      for (i = 0; i < n; ++i)
	      System.out.print(arr[i] + " ");
	   }

}
