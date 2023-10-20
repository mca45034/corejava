package in.com.Aggrigation_ArryList;

import java.util.ArrayList;
import java.util.Iterator;

public class Com_EMp_Main {
	ArrayList<Company>al=new ArrayList<Company>();
	void findEname(ArrayList<Company>al) {
		Iterator<Company>it=al.iterator();
		while(it.hasNext()) {
			Company c=it.next();
			if(c.e.ename.equalsIgnoreCase("ram")) {
				System.out.println(c.e.department+" :"+c.cname);
			}
		}
	}
	void findDep(ArrayList<Company>al) {
		Iterator<Company>it=al.iterator();
		while(it.hasNext()) {
			Company c=it.next();
			if(c.e.department.equalsIgnoreCase("hr")) {
				System.out.println("Employe name : "+c.e.ename+" Company name :"+c.cname+" company Location : "+c.clocation);
			}
		}
	}

	public static void main(String[] args) {
		Com_EMp_Main cm=new Com_EMp_Main();
		Employe e1=new Employe(01, "Sham", "HR");
		Employe e2=new Employe(02, "Ram", "IT");
		Employe e3=new Employe(03, "John", "Plecment");
		Employe e4=new Employe(04, "Ram", "HR");
		Employe e5=new Employe(05, "Lucy", "IT");
		Company c=new Company("Cisco", "Bombay", e1);
		Company c2=new Company("Googal", "Heydrabad", e2);
		Company c3=new Company("Microsoft", "Heydrabad", e3);
		Company c4=new Company("Googal", "Delhi", e4);
		Company c5=new Company("TCS", "Bombay", e5);
		ArrayList<Company>al=new ArrayList<Company>();
		al.add(c);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		cm.findEname(al);
		System.out.println("----------");
		cm.findDep(al);
		

	}

}
