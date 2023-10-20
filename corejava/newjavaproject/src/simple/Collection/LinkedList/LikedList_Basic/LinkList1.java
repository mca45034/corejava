package LikedList_Basic;

import java.util.LinkedList;

public class LinkList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(90);
		al.add(21);
		al.addFirst(200);
		al.addLast(400);
		System.out.println(al);
		al.add(100);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.removeFirstOccurrence(10);
		al.removeLastOccurrence(21);
		System.out.println(al);

	}

}
