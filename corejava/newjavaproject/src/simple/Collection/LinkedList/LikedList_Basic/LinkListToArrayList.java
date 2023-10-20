package LikedList_Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(80);
		System.out.println(al);
		Iterator<Integer> it=al.descendingIterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		ArrayList<Integer> all=new ArrayList<>(al);
		System.out.println("Converting LinkedList to ArrayList");
		System.out.println(all);

	}

}
