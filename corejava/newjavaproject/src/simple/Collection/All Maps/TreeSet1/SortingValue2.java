package TreeSet1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingValue2 {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		ArrayList<String>al=new ArrayList<>();
		LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
		hm.put(101, "Maths");
		hm.put(102, "English");
		hm.put(103, "Hindi");
		hm.put(104, "Sanskrit");
		Collection<String>col=hm.values();
		Iterator<String>it=col.iterator();
		while(it.hasNext()) {
			String s=it.next();
			al.add(s);
		}
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
		Iterator<String>it1=al.iterator();
		while(it1.hasNext()) {
			String s1=it1.next();
			Set<Entry<Integer,String>>set=hm.entrySet();
			for(Map.Entry<Integer, String>map:set) {
				String st=map.getValue();
				if(s1.equals(st)) {
					Integer i=map.getKey();
					lh.put(i, st);
					
				}
			}
		}
		System.out.println(lh);

	}
}
