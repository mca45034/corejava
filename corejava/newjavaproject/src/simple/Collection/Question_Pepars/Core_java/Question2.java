package Core_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		HashMap<String,Integer>hm=new HashMap<>();
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			String str[]=s.split("\\+");
			int in=Integer.parseInt(str[1]);
			if(hm.containsKey(str[0])) {
				hm.put( str[0],in);
			}
			else {
				hm.put(str[0], in);
			}
		}
		System.out.println(hm);
		
	}
}
