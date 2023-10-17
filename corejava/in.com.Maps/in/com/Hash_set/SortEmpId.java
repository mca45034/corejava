package in.com.Hash_set;

import java.util.Comparator;

public class SortEmpId implements Comparator<Employee23>{

	@Override
	public int compare(Employee23 o1, Employee23 o2) {
		if(o1.eid>o2.eid)
			return 1;
		else if(o1.eid<o2.eid)
			return -1;
		return 0;
	}

}
