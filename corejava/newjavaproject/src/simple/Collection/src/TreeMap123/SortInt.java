package TreeMap123;

import java.util.Comparator;

public class SortInt implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}

}
