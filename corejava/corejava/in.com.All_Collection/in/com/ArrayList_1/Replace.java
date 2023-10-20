package in.com.ArrayList_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Replace {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		ArrayList<String>al1=new ArrayList<>();
		al.add("a+2");
		al.add("b+6");
		al.add("cc+12");
		al.add("d+5");
		//System.out.println(al);
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			String s=it.next();
			String s1=s.replace("+", "");
			String s2=s1.toUpperCase();
			//System.out.println(s1);
			al1.add(s2);
		}
		System.out.println(al1);

	}

}
