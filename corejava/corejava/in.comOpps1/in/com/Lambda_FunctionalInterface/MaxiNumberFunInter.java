package in.com.Lambda_FunctionalInterface;

@FunctionalInterface
interface Array1{
	public void maxi(int arr[]);
}
public class MaxiNumberFunInter {

	public static void main(String[] args) {
		int arr[]= {12,34,21,32,34,23,10};
		
		Array1 a=new Array1() {
			
			@Override
			public void maxi(int[] arr) {
				int max=arr[0];
				for(int i=0;i<arr.length;i++) {
					
					if(arr[i]>max) {
						max=arr[i];
					}
				}
				System.out.println(max);
				
				
			}
		};
		a.maxi(arr);

	}

}
