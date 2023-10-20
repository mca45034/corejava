package march1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Question20 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		HashMap<Integer,Integer>hm=new HashMap<>();
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
	Iterator<Integer>it=	al.iterator();
	while(it.hasNext()) {
	Integer i=it.next();
		Integer count=1;
		if(hm.containsKey(i)) {
			count=hm.get(i);
			count=count+1;
			hm.put(i, count);
		}
		else {
			hm.put(i, count);
		}
	}
	System.out.println(hm);

	}

}
