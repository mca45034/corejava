package in.com.Arryas0;

public class CompareToArrays {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		int flage=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i] != arr[j]) {
					flage=1;
				}
			}
		}
		if(flage==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
