package HashMap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		HashMap<String,Integer>all=new HashMap<>();
		al.add("pizzapan");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String c=it.next();
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
