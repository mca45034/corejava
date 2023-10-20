package HashMap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

public class SupplierItemMain {

	public static void main(String[] args) {
		Item i1=new Item("milk",50);
		Item i2=new Item("curd",40);
		Item i3=new Item("paneer",60);
		Item i4=new Item("pulses",90);
		Item i5=new Item("cereals",100);
		Item i6=new Item("mobiles",12000);
		Item i7=new Item("charger",2000);
		Item i8=new Item("headphones",1200);
		
		ArrayList<Item> al=new ArrayList<Item>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		ArrayList<Item> al2=new ArrayList<Item>();
		al2.add(i4);
		al2.add(i5);
		ArrayList<Item> al3=new ArrayList<Item>();
		al3.add(i6);
		al3.add(i7);
		al3.add(i8);
//	Supplier s=new Supplier(1,"Mr ram",al);
//	Supplier s1=new Supplier(2,"Mr suresh",al);
		Supplier s=new Supplier(1,"Mr ram",al);
		Supplier s1=new Supplier(2,"Mr suresh",al2);
		Supplier s2=new Supplier(3,"Mr ramesh",al3);
		
		
		
		
		
		HashMap<String,Supplier> hs=new HashMap<String,Supplier>();
		
		hs.put("Mr. ram", s);
		hs.put("Mr. suresh", s1);
		hs.put("Mr. remesh", s2);
		
	Set<Entry<String,Supplier>> set=	hs.entrySet();
	
	for(Map.Entry<String, Supplier> map:set)
	{
		
		String s_id=map.getKey();
		System.out.print(s_id);
		Supplier sup=map.getValue();
		ArrayList<Item> item=sup.al;
		Iterator<Item> itt=item.iterator();
		System.out.print("={");
		while(itt.hasNext())
		{
			Item i=itt.next();
			System.out.print(i.item_name+",");
		}
		System.out.print("}");
		System.out.println("");
		
	}
	

	}

}
