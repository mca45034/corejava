package in.com.List_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_use {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<Integer>();
		l.add(109);
		l.add(108);
		l.add(112);
		l.add(123);
		l.add(19);
		l.add(10);
		l.add(113);
		l.add(127);
		l.add(124);
		l.add(149);
		System.out.println(l);
		Stream<Integer>stream=l.stream();
		List<Integer>l1=stream.filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(l1);

	}

}
