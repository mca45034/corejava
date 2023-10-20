package Assigment_TreeMap;

import java.util.Comparator;

public class CustomerId implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if(o2.cusId>o1.cusId)
			return 1;
		else if(o2.cusId<o1.cusId)
			return -1;
		return 0;
	}


}
