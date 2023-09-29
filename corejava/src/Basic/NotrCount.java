package Basic;

import java.util.Scanner;

public class NotrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the count of many : ");
//		int many=sc.nextInt();
//		int a[]= {500,200,100,50,20,10,5,2,1};
//		int count=0;
//		for (int i = 0; i < a.length; i++) {
//			count=many/a[i];
//			if(count >0) {
//				System.out.println(a[i]+" | "+count);
//			}
//			
//		   many=many%a[i];
//		}
		int many=1250;
		int note[]= {500,200,100,50,20,10,5,2,1};
		int count=0;
		for (int i = 0; i < note.length; i++) {
			count=many/note[i];
			if(count>0) {
				System.out.println(note[i]+" "+count);
			}
			many=many%note[i];
			
			
		}
		
		
	}

}
