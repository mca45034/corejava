package HashSet1;

import java.util.Comparator;

public class BankName implements Comparator<Bankes>{
	@Override
	public int compare(Bankes o1, Bankes o2) {
		
		return o2.name.compareTo(o1.name);
	}

}
