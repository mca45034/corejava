package HashSet12;

import java.util.HashSet;
import java.util.TreeSet;


public class BankesMain {
	public static void main(String[] args) {
		Bankes b=new Bankes(101,"SBI",3425345,"Delhi");
		Bankes b1=new Bankes(104,"HDFC",3425345,"Delhi");
		Bankes b2=new Bankes(102,"BOI",3425345,"Delhi");
		Bankes b3=new Bankes(103,"Cenra",3425345,"Delhi");
		HashSet<Bankes>hs=new HashSet<>();
		hs.add(b);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		TreeSet<Bankes> ts=new TreeSet(hs);
		System.out.println(ts);
		System.out.println("----------Bankes name sort------");
		TreeSet<Bankes> ts1=new TreeSet(new BankName());
		ts1.addAll(hs);
		System.out.println(ts1);
		System.out.println("-------location sort------");
		TreeSet<Bankes> ts2=new TreeSet(new BankeLocation());
		ts2.addAll(ts);
		System.out.println(ts2);
		
	}

}
