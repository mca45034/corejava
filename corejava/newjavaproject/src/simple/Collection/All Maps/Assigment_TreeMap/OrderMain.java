package Assigment_TreeMap;

import java.util.HashSet;
import java.util.TreeSet;

public class OrderMain {

	public static void main(String[] args) {
		
			Order o=new Order(001,12-2022,"Delhi");
			Order o1=new Order(002,15-2022,"Indore");
			Order o2=new Order(003,28-2022,"Pune");
			Order o3=new Order(004,03-2022,"Chennai");
			HashSet<Order>hs=new HashSet<>();
			hs.add(o);
			hs.add(o1);
			hs.add(o2);
			hs.add(o3);
			TreeSet<Order> ts=new TreeSet<>(hs);
			System.out.println(ts);
			TreeSet<Order> ts1=new TreeSet<>(new SortOrder());
			ts1.addAll(ts);
			System.out.println(ts1);

		

	}

}
