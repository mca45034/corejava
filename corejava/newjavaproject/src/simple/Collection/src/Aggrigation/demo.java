package Aggrigation;

public class demo {

	public static void main(String[] args) {
		int a[]= {6,5,4,3,2,1,8,54,23,12,34,56,78,9,6,4,2,3,5,7,8,9};
		int avg=0,sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			avg=sum/a.length;
			
		}
		System.out.println(a.length);
		System.out.println(sum);
		System.out.println(avg);
		
		

	}

}
