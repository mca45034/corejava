package AggrigationArrayList_sorting;

import java.util.Comparator;

public class EmployeLocation implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee o1, ComparatorEmployee o2) {
		// TODO Auto-generated method stub
		return o1.location.compareToIgnoreCase(o2.location);
	}

}
