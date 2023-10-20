package Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,1};
		for(int i=0;i<a.length;i++) {
			int li=0;
			for(int j=0;j<i;j++) {
				li=li+a[j];
			}
			int ri=0;
			for(int j=i+1;j<a.length;j++) {
				ri=ri+a[j];
			}
			if(li==ri) {
				System.out.println(a[i]);
			}
		}

	}

}
