package Aggrigation;

import java.util.ArrayList;
import java.util.Iterator;

public class SuplayerMain {
	ArrayList<Suplayer>al=new ArrayList<>();
	SuplayerMain(ArrayList<Suplayer>al){
		this.al=al;
	}
	void findSuplayer() {
		Iterator<Suplayer> it=al.iterator();
		while(it.hasNext()) {
			Suplayer s=	it.next();
			if(s.t.price>10000) {
				System.out.println(s.sname);
			}
		}
	}
	
		void findCity() {
			 System.out.println("-------------------");
		
			Iterator<Suplayer>it1=al.iterator();
			while(it1.hasNext()) {
				Suplayer s=it1.next();
				if(s.location.equals("Mumbai")) {
					System.out.println(s.sname);
				}
			}
			
		}
		
	

	public static void main(String[] args) {
		Item i=new Item(101, "mobaile", 12000);
		Item i1=new Item(102, "charger", 2000);
		Item i2=new Item(103, "headphone", 13000);
		Item i3=new Item(104, "bettary", 12000);
		Suplayer s=new Suplayer("Ramesh","Mumbai", 81202135, i);
		Suplayer s1=new Suplayer("Dinesh","Mumbai", 88202135,i1);
		Suplayer s2=new Suplayer("Ram","pune", 801202135,i2);
		Suplayer s3=new Suplayer("sham","indore", 891202135,i3);
		ArrayList<Suplayer>al=new ArrayList<>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		SuplayerMain sup=new SuplayerMain(al);
		sup.findSuplayer();
		sup.findCity();
		

	}

}
