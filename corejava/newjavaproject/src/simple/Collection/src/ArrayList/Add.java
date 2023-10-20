package ArrayList;

import java.util.ArrayList;

public class Add {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(13);
		al.add(34);
		al.add(99);
		al.add(41);
		al.add(91);
		System.out.println(al);
		ArrayList<Integer> all =new ArrayList<Integer>();
		all.add(200);
		all.add(300);
		all.add(400);
		System.out.println(all);
		al.addAll(all);
		System.out.println(al);
		al.addAll(2, all);
		System.out.println(al);
		System.out.println(al.size());

	}

}
