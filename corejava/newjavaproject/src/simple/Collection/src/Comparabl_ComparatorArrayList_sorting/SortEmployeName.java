package Comparabl_ComparatorArrayList_sorting;

import java.util.Comparator;

public class SortEmployeName implements Comparator<ComparatorEmployeMain> {

	@Override
	public int compare(ComparatorEmployeMain o1, ComparatorEmployeMain o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
