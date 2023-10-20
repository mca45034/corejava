package in.com.Aggrigation_ArryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Short_name {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<> ();
		List<String>l=new ArrayList<>();
		al.add("Sham");
		al.add("Dev");
		al.add("Alex");
		al.add("Ram");
		al.add("Bobs");
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			l.add(s);
			
		}
		Collections.sort(l);
		System.out.println(l);

	}

}
