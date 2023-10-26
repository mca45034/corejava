package in.com.Aggrigation_AComparator_ArrayList;

import java.util.Comparator;

public class SortName2 implements Comparator<Book_Mains>{

	@Override
	public int compare(Book_Mains o1, Book_Mains o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	

	

}
