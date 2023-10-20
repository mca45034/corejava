package Assigment_TreeMap1;

import java.util.HashMap;
import java.util.TreeMap;

import TreeMap123.SortInt;

public class AceDicendingTreeINteger {

	public static void main(String[] args) {
		HashMap<Integer,String> al=new HashMap<Integer,String>();
		al.put(118, "vailet");
		al.put(101, "Black");
		al.put(111, "Red");
		al.put(115, "Pink");
		al.put(106, "Yellow");
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(al);
		System.out.println(tm);
		TreeMap<Integer,String> tm1=new TreeMap<Integer,String>(new Sorts());
		tm1.putAll(al);
		System.out.println(tm1);
	}
}