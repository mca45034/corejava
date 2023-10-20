package in.com.Hash_Mapss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindValueToKey1 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		ArrayList<String>al=new ArrayList<>();
		LinkedHashMap<Integer,String>lhmp=new LinkedHashMap<>();
		hm.put(123, "sahul");
		hm.put(234, "ram");
		hm.put(345, "aagar");
		hm.put(456, "dev");
		hm.put(567, "bmesh");
		Collection<String>cl=hm.values();
		Iterator<String>it=cl.iterator();
		while(it.hasNext()) {
			String s=it.next();
			al.add(s);	
		}
		Collections.sort(al);
		Iterator<String>it1=al.iterator();
		while(it1.hasNext()) {
			String s1=it1.next();
			Set<Entry<Integer,String>>set=hm.entrySet();
			for(Map.Entry<Integer, String>map:set) {
				String s2=map.getValue();
				if(s2.equals(s1)) {
					Integer i=map.getKey();
					lhmp.put(i, s2);				}
			}
			
			
		}
		System.out.println(lhmp);
		
		
		

	}

}
