package Comparabl_ComparatorArrayList_sorting;

import java.util.Comparator;

public class SortEmpliyeHobby implements Comparator<ComparatorEmployeMain>{

	@Override
	public int compare(ComparatorEmployeMain o1, ComparatorEmployeMain o2) {
		// TODO Auto-generated method stub
		return o2.hobby.compareTo(o1.hobby);
	}

}
