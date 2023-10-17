package in.com.Aggrigation_AComparator_ArrayList;

import java.util.Comparator;

public class SortName implements Comparator<Student_Main>{

	@Override
	public int compare(Student_Main o1, Student_Main o2) {

		return o1.name.compareTo(o2.name);
	}

}
