package in.com.Aggrigation_AComparator_ArrayList;

import java.util.Comparator;

public class SortBookId implements Comparator<Book_Mains>{

	@Override
	public int compare(Book_Mains o1, Book_Mains o2) {
		if(o1.id>o2.id)
			return 1;
		else if (o1.id<o2.id)
			return -1;
		return 0;
	}

}
