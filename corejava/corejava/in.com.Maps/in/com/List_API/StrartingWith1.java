package in.com.List_API;

import java.util.List;
import java.util.stream.Collectors;

public class StrartingWith1 {

	public static void main(String[] args) {
		List<String>l1=List.of("ram","rahul","ramesh","dev");
		List<String>l2=l1.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
		System.out.println(l2);

	}

}
