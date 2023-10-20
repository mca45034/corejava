package HashSet1;

import java.util.Comparator;

public class BankeLocation implements Comparator<Bankes>{
	@Override
	public int compare(Bankes o1, Bankes o2) {
		
		return o2.location.compareTo(o1.location);
	}
}
