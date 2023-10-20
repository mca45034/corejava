package Assigment_TreeMap1;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c=new Customer(4,"Sham","Nokia");
		Customer c1=new Customer(1,"Sham","Nokia");
		Customer c2=new Customer(3,"Sham","Nokia");
		Customer c3=new Customer(2,"Sham","Nokia");
		
		Order o=new Order(001,12-2022,"Delhi");
		Order o1=new Order(002,15-2022,"Indore");
		Order o2=new Order(003,28-2022,"Pune");
		Order o3=new Order(004,03-2022,"Chennai");
		HashSet<Customer>hs=new HashSet<>();
		hs.add(c);
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		TreeSet<Customer> ts=new TreeSet (hs);
		System.out.println(ts);
		TreeSet<Customer> ts1=new TreeSet (new CustomerId());
		ts1.addAll(ts);
		System.out.println(ts1);
		

	}

}
