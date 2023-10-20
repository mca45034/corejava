package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FrrquencyCharecterHashMap {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<>();
		HashMap<Character,Integer>all=new HashMap<>();
		al.add('a');
		al.add('c');
		al.add('v');
		al.add('m');
		al.add('a');
		al.add('a');
		al.add('m');
		al.add('r');
		al.add('a');
		al.add('m');
		al.add('a');
		al.add('v');
		al.add('r');
		al.add('b');
		al.add('g');
		al.add('c');
		al.add('b');
		Iterator<Character> it=al.iterator();
		while(it.hasNext()) {
			Character c=it.next();
			System.out.println(c);
			int count=1;
			if(all.containsKey(c)) {
				count=all.get(c);
				count=count+1;
				all.put(c, count);
			}
				else {
					all.put(c, count);
				}
			
				
			}
		System.out.println(all);
		}

	}










