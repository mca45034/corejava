package HashMap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencyCity {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		HashMap<String,Integer> all=new HashMap<>();
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");
		System.out.println(al);
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			int count=1;
			if(all.containsKey(s)) {
				count=all.get(s);
			    count=count+1;
			    all.put(s, count);
			}
			else { 
				all.put(s, count);
			}
		}
		System.out.println(all);
		

	}
}
