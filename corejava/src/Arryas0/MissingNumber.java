package Arryas0;
public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 6, 7};
        int arr1[] = {1, 2, 3, 4, 5, 7};
        int []arr4=new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                   
                    arr4[i] = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr4[i]==0) {
                System.out.println(arr[i]);
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            if (arr4[j]==0) {
                System.out.println(arr1[j]);
            }
        }


	}
}
