package Comparabl_ComparatorArrayList_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortIntegrMain {
	void findInteger(ArrayList<SortInteger> al) {
		Collections.sort(al);
		Iterator<SortInteger> it=al.iterator();
		while(it.hasNext()) {
			SortInteger s1=it.next();
			System.out.println(s1);
		}
		//System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortInteger si=new SortInteger(105, "Sham");
		SortInteger si1=new SortInteger(102, "Ram");
		SortInteger si2=new SortInteger(104, "Zack");
		SortInteger si3=new SortInteger(101, "Bob");
		SortInteger si4=new SortInteger(103, "Lucy");
		ArrayList<SortInteger> al=new ArrayList<>();
		al.add(si);
		al.add(si1);
		al.add(si2);
		al.add(si3);
		al.add(si4);
		SortIntegrMain s=new SortIntegrMain();
		s.findInteger(al);
		

	}

}
