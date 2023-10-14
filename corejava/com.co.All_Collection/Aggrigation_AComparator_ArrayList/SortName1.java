package Aggrigation_AComparator_ArrayList;

import java.util.Comparator;

public class SortName1 implements Comparator<Student_Main1>{

	@Override
	public int compare(Student_Main1 o1, Student_Main1 o2) {
		
		return o2.name.compareTo(o1.name);
	}

	

}
