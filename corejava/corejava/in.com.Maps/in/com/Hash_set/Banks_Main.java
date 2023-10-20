package in.com.Hash_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Banks_Main {

	public static void main(String[] args) {
		HashSet<Bankers>hs=new HashSet<Bankers>();
		Bankers b=new Bankers(109, "sham", 765855654, "indore");
		Bankers b1=new Bankers(112, "ram", 987855654, "pune");
		Bankers b2=new Bankers(121, "lucey", 989855654, "noida");
		Bankers b3=new Bankers(189, "dev", 555855654, "lalkila");
		Bankers b4=new Bankers(109, "pappu", 765855654, "ujjain");
		hs.add(b);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		//System.out.println(hs);
		System.out.println("=========Sort id=========");
		TreeSet<Bankers>tr=new TreeSet<>(hs);
		Iterator<Bankers>it=tr.iterator();
		while(it.hasNext()) {
			Bankers bank=it.next();
			System.out.println(bank);
		}
		
		System.out.println("=====sort name======");
		TreeSet<Bankers>tr1=new TreeSet<>(new SortName());
		tr1.addAll(hs);
		Iterator<Bankers>it1=tr1.iterator();
		while(it1.hasNext()) {
			Bankers bank1=it1.next();
			System.out.println(bank1);
		}
		
		
		
		
		

	}

}
