package Comparabl_ComparatorArrayList_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assigment_4 {

	public static void main(String[] args) {
		Employe4 e=new Employe4(1, "Sham", 40);
		Employe4 e1=new Employe4(2, "Ram", 45);
		Employe4 e2=new Employe4(3, "Jack", 35);
		Employe4 e3=new Employe4(4, "Lucy", 49);
		Employe4 e4=new Employe4(5, "Shri", 56);
		ArrayList<Employe4> al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		Iterator<Employe4> it=al.iterator();
		while(it.hasNext()) {
			Employe4 ep=it.next();
			System.out.println(ep);
		}
		
	}

}
