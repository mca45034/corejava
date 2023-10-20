package HashMap1;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		HashMap<String,Integer> al=new HashMap<>();
		al.put("yellow cloths", 122);
		al.put("black cloths", 134);
		al.put("red cloths", 187);
		al.put("pink cloths", 100);
		System.out.println(al);
		TreeMap<String,Integer> all=new TreeMap(al);
		System.out.println(all);
		

	}
}
