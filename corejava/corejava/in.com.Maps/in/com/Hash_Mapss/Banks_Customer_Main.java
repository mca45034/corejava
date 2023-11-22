package in.com.Hash_Mapss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Banks_Customer_Main {

	public static void main(String[] args) {
		Customer c=new Customer(101, "sham");
		Customer c1=new Customer(134, "ram");
		Customer c2=new Customer(103, "dev");
		Customer c3=new Customer(111, "ankit");
		Banks b=new Banks("sbi", "indore");
		Banks b1=new Banks("boi", "pune");
		HashMap<Customer, Banks>hm=new HashMap<Customer, Banks>();
		hm.put(c, b);hm.put(c1, b1);hm.put(c2, b);hm.put(c3, b1);
		System.out.println("find the sbi bank in any city....");
		Set<Entry<Customer,Banks>>set=hm.entrySet();
		for(Entry<Customer, Banks>map:set) {
			Customer cu=map.getKey();
			Banks ba=map.getValue();
			if(ba.name.equals("sbi")) {
				System.out.println(cu.id+" "+cu.name+" "+ba.location);
			}
		}
		System.out.println("find the pune city bank and customer...");
		Set<Entry<Customer,Banks>>set1=hm.entrySet();
		for(Entry<Customer, Banks>map:set1) {
			Customer cm=map.getKey();
			Banks bs=map.getValue();
			if(bs.location.equals("pune")) {
				System.out.println(bs.name+" "+cm.id+" "+cm.name);
			}
		}
		
		
		

	}

}
