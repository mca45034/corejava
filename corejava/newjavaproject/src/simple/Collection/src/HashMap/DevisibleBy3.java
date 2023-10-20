package HashMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class DevisibleBy3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("A+2");
		al.add("B+12");
		al.add("D+4");
		al.add("DD+5");
		System.out.println(al);
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			String d=s.replace("+", "");
			System.out.println(d);

			
		}

	}

}
