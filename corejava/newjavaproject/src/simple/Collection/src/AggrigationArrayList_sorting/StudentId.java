package AggrigationArrayList_sorting;

import java.util.Comparator;

public class StudentId implements Comparator<CompretorStudent>{

	@Override
	public int compare(CompretorStudent o1, CompretorStudent o2) {
		if(o1.id<o2.id)
			return 1;
		else if(o1.id>o2.id)
			return -1;
		return 0;
	}

}
