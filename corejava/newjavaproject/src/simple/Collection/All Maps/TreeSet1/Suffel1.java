package TreeSet1;

import java.util.ArrayList;
import java.util.Collections;

public class Suffel1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(34);
		al.add(56);
		al.add(89);
		al.add(90);
		Collections.shuffle(al);
		System.out.println(al);
	}
}
