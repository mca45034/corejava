package AggrigationArrayList_sorting;

import java.util.Comparator;

public class EmployeSelary implements Comparator<ComparatorEmployee> {

	@Override
	public int compare(ComparatorEmployee o1, ComparatorEmployee o2) {
		// TODO Auto-generated method stub
		if(o2.selary>o1.selary)
			return 1;
		else if(o2.selary<o1.selary)
			return -1;
		else 
		return 0;
	}

}
