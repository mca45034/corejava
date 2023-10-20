package Assigment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Assigment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> al=new LinkedList<>();
		al.add(13);
		al.add("Sham");
		al.add('R');
		al.add(true);
		al.addFirst(12);
		al.addLast(100);
		System.out.println(al.size());
		//System.out.println(al);
		ArrayList<Object> all=new ArrayList<>(al);
		System.out.println(all);
		

	}

}
