package in.com.Lambda_FunctionalInterface;
@FunctionalInterface
interface SecondLargeNo{
	public void SecondNo(int arr[]);
}

public class SecondLargest_FunctionalInterface {

	public static void main(String[] args) {
		int arr[]= {23,45,34,67,12,32,12};
		SecondLargeNo sn=new SecondLargeNo() {
			

			@Override
			public void SecondNo(int[] arr) {
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]>arr[j]) {
							int tmp=arr[i];
							arr[i]=arr[j];
							arr[j]=tmp;
						}
						
					}
				}
				System.out.println(arr[arr.length-2]);
				
			}
			
		};
		sn.SecondNo(arr);

	}

}
