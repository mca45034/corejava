package Arrays;

import java.util.Arrays;

public class MoveNagetiveNumber {

	public static void main(String[] args) {
		int a[]= {1,-2,4,-5,9,0};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
