package in.com.Hash_set;

import java.util.Comparator;

public class DepSortName implements Comparator<Department>{

	@Override
	public int compare(Department o1, Department o2) {
		// TODO Auto-generated method stub
		return o1.dname.compareTo(o2.dname);
	}

	

}
