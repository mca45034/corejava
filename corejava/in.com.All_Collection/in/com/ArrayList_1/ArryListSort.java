package in.com.ArrayList_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArryListSort {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		List<String> al2=new ArrayList<>();
		al.add("black");
		al.add("blue");
		al.add("brown");
		al.add("red");
		al.add("al");
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next().toLowerCase();
			al2.add(s);
		}
		Collections.sort(al2);
		System.out.println(al2);

	}

}
