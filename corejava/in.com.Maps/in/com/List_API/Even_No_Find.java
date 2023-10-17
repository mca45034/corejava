package in.com.List_API;

import java.util.ArrayList;
import java.util.List;

public class Even_No_Find {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(109);
		l.add(108);
		l.add(112);
		l.add(123);
		l.add(19);
		l.add(10);
		l.add(113);
		l.add(127);
		l.add(124);
		l.add(149);
		System.out.println(l);
		List<Integer>l1=new ArrayList<Integer>();
		
		for (Integer k : l) {
			if(k%2==0) {
				l1.add(k);
			}
		}
		System.out.println(l1);
		
		

	}

}
