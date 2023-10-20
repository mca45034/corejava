package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListToLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(80);
		System.out.println(al);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		LinkedList<Integer> all=new LinkedList<>(al);
		System.out.println(all);

	}

}
