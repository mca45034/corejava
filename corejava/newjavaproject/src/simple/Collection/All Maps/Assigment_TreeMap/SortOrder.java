package Assigment_TreeMap;

import java.util.Comparator;

public class SortOrder implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		
		return o2.l_Location.compareTo(o1.l_Location);
	}

}



