package Assigment;

import java.util.LinkedList;

public class Assigment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al=new LinkedList<>();
		al.add(13);
		al.add(30);
		al.add(40);
		al.add(56);
		al.addFirst(12);
		al.addLast(100);
		//System.out.println(al);
		al.clone();
		//System.out.println(al);
		LinkedList<Integer> all=new LinkedList<>(al);
		System.out.println(al);
		
		

	}

}
