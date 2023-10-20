package Assigment;

import java.util.Collections;
import java.util.LinkedList;

public class Assigment_2 {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(13);
		al.add(30);
		al.add(40);
		al.add(56);
		al.addFirst(12);
		al.addLast(100);
		System.out.println(al);
		LinkedList<Integer> all=new LinkedList<>();
		all.add(130);
		all.add(300);
		all.add(450);
		all.add(516);
		all.addFirst(120);
		all.addLast(10);
		System.out.println(all);
		al.addAll(all);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		

	}

}
