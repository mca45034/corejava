package in.com.List_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DublicateRemoveList {

	public static void main(String[] args) {
		List<Integer>l=List.of(1,3,5,4,1,5,2,3,4);
		List<Integer>l1=l.stream().distinct().collect(Collectors.toList());
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
