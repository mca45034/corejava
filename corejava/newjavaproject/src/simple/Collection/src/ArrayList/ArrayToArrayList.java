package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//array to arrayList converted
//		Integer a[]= {10,20,30,40};
//		List<Integer> al=Arrays.asList(a);
//		ArrayList all=new ArrayList(al);
//		System.out.println(all);
//		all.add(60);
//		System.out.println(all);
//		//ArrayList to Array converted
		ArrayList<Integer> p=new ArrayList<>(3);
		p.add(10);
		p.add(30);
		p.add(50);
		p.add(70);
		Object arr[]=p.toArray();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
    //  ArrayList<Integer>  al2=new ArrayList<>(p);
	
	
		
	//	System.out.println(al2);
		
		

	}

}
