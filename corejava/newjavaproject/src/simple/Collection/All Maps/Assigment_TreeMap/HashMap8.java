package Assigment_TreeMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap8 {
	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
		ArrayList<Integer>al=new ArrayList<>();
		LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
		hm.put("Sham", 001);
		hm.put("Ram", 004);
		hm.put("Payal", 002);
		hm.put("Pooja", 003);
		Collection <Integer>col=hm.values();
		Iterator<Integer>it=col.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al);
		Iterator<Integer>it1=al.iterator();
		while(it1.hasNext()) {
			Integer i1=it1.next();
			Set<Entry<String,Integer>>set=hm.entrySet();
			for(Map.Entry<String, Integer>map:set) {
				Integer i2=map.getValue();
				if(i1.equals(i2)) {
					String s=map.getKey();
					lhm.put(s, i2);
					
				}
			}
		}
		System.out.println(lhm);
	}

}
