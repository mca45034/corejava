package in.com.Hash_set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindValueToKey {

	public static void main(String[] args) {
		HashMap<Integer,String>hs=new HashMap<>();
		ArrayList<String>al=new ArrayList<>();
		LinkedHashMap<Integer,String>lhmp=new LinkedHashMap<>();
		hs.put(101, "sham");
		hs.put(123, "rahul");
		hs.put(220, "ram");
		hs.put(200, "dev");
		Collection<String>cl=hs.values();
		Iterator<String>it=cl.iterator();
		while(it.hasNext()) {
			String s=it.next();
			al.add(s);
		}
		Collections.sort(al);
		System.out.println(al);
		Iterator<String>it1=al.iterator();
		while(it1.hasNext()) {
			String s2=it1.next();
			Set<Entry<Integer,String>>set=hs.entrySet();
			for(Entry<Integer,String>map:set) {
				String s3=map.getValue();
				if(s2.equals(s3)) {
					Integer i=map.getKey();
					lhmp.put(i, s3);
				}
			}
		}
		System.out.println(lhmp);

	}

}
