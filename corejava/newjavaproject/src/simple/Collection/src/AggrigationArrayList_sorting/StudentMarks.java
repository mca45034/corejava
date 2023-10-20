package AggrigationArrayList_sorting;

import java.util.Comparator;

public class StudentMarks implements Comparator<CompretorStudent>{

	@Override
	public int compare(CompretorStudent o1, CompretorStudent o2) {
		if(o1.marks>o2.marks)
			return 1;
		else if(o1.marks<o2.marks)
			return -1;
		else
			return 0;
	}

}
