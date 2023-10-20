package HashSet1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindValue {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		ArrayList<String>al=new ArrayList<>();
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
		hm.put(101, "Rahul");
		hm.put(106, "Dev");
		hm.put(112, "Amar");
		hm.put(104, "Bob");
		Collection<String>col=hm.values();
		Iterator<String>it=col.iterator();
		while(it.hasNext()) {
			String s1=it.next();
			al.add(s1);
			
		}
		Collections.sort(al);
		System.out.println(al);
		Iterator<String>it2=al.iterator();
		while(it2.hasNext()) {
			String i1=it2.next();
			Set<Entry<Integer,String>>set=hm.entrySet();
			for(Map.Entry<Integer, String>map:set) {
				String s2=map.getValue();
				if(s2.equals(i1)) {
					Integer io=map.getKey();
					lhm.put(io, i1);
					
				}
				
			}
		}
		System.out.println(lhm);

	}

}
