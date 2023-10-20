package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Frequencyd {

	public static void main(String[] args) {
		// oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’)
			//	newMap = {‘a’,3) , (‘b’,2),(‘c’,1)
		ArrayList<Character> al=new ArrayList<>();
		HashMap<Character,Integer>all=new HashMap<>();
		al.add(1,'a');
		al.add(2,'b');
		al.add(3,'c');
		al.add(4,'d');
		al.add(5,'a');
		al.add(6,'a');
		Iterator<Character> it=al.iterator();
		while(it.hasNext()) {
			Character o=it.next();
			int count=1;
			if(all.containsKey(o)) {
				count=all.get(o);
				count=count+1;
				all.put(o, count);
			}
				else {
					all.put(o, count);
				}
			}
		System.out.println(al);
		}
		
	}

	