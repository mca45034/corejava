package TreeSet1;

import java.util.HashMap;
import java.util.TreeMap;

public class As_DiscendingHM_TM {
	public static void main(String[] args) {
		HashMap<Integer,String> al=new HashMap<Integer,String>();
		al.put(118, "vailet");
		al.put(101, "Black");
		al.put(111, "Red");
		al.put(115, "Pink");
		al.put(106, "Yellow");
		//System.out.println(al);
		//Ascending order follow always 
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(al);
		System.out.println(tm);
		//Discending order follow
		TreeMap<Integer,String> tm1=new TreeMap<Integer,String>(new SortInt());
		tm1.putAll(al);
		System.out.println(tm1);
		
		

	}
}
