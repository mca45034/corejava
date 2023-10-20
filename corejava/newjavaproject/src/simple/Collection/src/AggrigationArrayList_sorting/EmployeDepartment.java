package AggrigationArrayList_sorting;

import java.util.Comparator;

public class EmployeDepartment implements Comparator<ComparatorEmployee>{

	@Override
	public int compare(ComparatorEmployee o1, ComparatorEmployee o2) {
		// TODO Auto-generated method stub
		return o2.departmnet.compareToIgnoreCase(o1.departmnet);
	}

}
