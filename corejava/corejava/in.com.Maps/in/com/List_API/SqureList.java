package in.com.List_API;

import java.util.List;
import java.util.stream.Collectors;

public class SqureList {

	public static void main(String[] args) {
		List<Integer>l=List.of(1,2,3,4,5,6);
		List<Integer>l1=l.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(l1);

	}

}
