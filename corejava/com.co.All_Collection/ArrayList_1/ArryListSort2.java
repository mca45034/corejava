package ArrayList_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArryListSort2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		List<Integer> l=new ArrayList<>();
		al.add(23);
		al.add(12);
		al.add(67);
		al.add(3);
		al.add(45);
		al.add(12);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			l.add(i);
		}
		Collections.sort(al);
		System.out.println(al);
		
		

	}

}
