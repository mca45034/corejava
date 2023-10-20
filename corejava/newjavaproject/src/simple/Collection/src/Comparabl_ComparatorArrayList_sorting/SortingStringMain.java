package Comparabl_ComparatorArrayList_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingStringMain {
	ArrayList<SortinName> al=new ArrayList<>();
	void findName(ArrayList<SortinName> al) {
		Collections.sort(al);
		Iterator<SortinName>it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(al);
	}
	

	public static void main(String[] args) {
		SortinName sn=new SortinName("Samsung", "Mobile");
		SortinName sn1=new SortinName("Nokia", "charger");
		SortinName sn2=new SortinName("OLG", "HeadPhone");
		SortinName sn3=new SortinName("Sony", "TV");
		ArrayList<SortinName> al=new ArrayList<>();
		al.add(sn);
		al.add(sn1);
		al.add(sn2);
		al.add(sn3);
		SortingStringMain s=new SortingStringMain();
		s.findName(al);
		
	}

}
