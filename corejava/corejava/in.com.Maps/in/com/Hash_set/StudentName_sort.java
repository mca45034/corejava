package in.com.Hash_set;

import java.util.Comparator;

public class StudentName_sort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
