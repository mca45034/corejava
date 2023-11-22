package in.com.List_API;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DublicateREmoveStream {

	public static void main(String[] args) {
		List<Integer>list=List.of(1,2,3,2,1,23,45,3,4,5,6,5,3,6,4,2,5,6,3,6,7,4,67,8,9);
		List<Integer>l=list.stream().distinct().collect(Collectors.toList());
		List<Integer>l1=l.stream().filter(r -> r%2 ==0).collect(Collectors.toList());
		List<Integer>l2=l.stream().filter(r->r%2 !=0).collect(Collectors.toList());
		List<Integer>l3=l.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("dublicate remove...");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("find even number....");
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println("find odd number....");
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println("find the all of squre number in list.......");
		Collections.sort(l3);
		System.out.println(l3);
		
		List<String>l4=List.of("ram","ramesh","dev","ankit");
		List<String>l5=l4.stream().filter(e->e.startsWith("r")).collect(Collectors.toList());
		System.out.println(l5);
		
		

	}

}
