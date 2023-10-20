package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMthods {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the serach element : ");
//		int num=sc.nextInt();
//		int num1=sc.nextInt();
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(20);
		all.add(40);
		all.add(50);
		all.add(60);
		System.out.println(all);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(401);
		al.add(400);
		al.add(59);
		System.out.println(al);
		all.addAll(al);
		System.out.println(all);
		Boolean b=all.contains(20);
		if(b==true) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element is not found");
		}
		Boolean b1=al.contains(201);
		if(b1==true) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Elemnt is not found");
		}
//		all.clear();
//		System.out.println(all);
		all.clone();
		//all.removeAll(al);
		System.out.println(all);

	}

}
