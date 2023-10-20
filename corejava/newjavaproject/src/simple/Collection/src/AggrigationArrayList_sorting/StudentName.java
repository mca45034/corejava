package AggrigationArrayList_sorting;

import java.util.Comparator;

public class StudentName implements Comparator<CompretorStudent>{

	@Override
	public int compare(CompretorStudent o1, CompretorStudent o2) {
		return o2.name.compareTo(o1.name);
	}

	

}
