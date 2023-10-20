package Aggrigation;

import java.util.ArrayList;
import java.util.Iterator;

public class CompanyMain {
	ArrayList<Company> al=new ArrayList<>();
	void findNameE(ArrayList<Company> al) {
	Iterator<Company>it=	al.iterator();
	while(it.hasNext()) {
		Company co=it.next();
		if(co.e.ename.equals("Ram")){
			System.out.println(co.e.edepartment);
		}
	}
	}
void findDepartmentE(ArrayList<Company> al) {
	Iterator<Company>it1=	al.iterator();
	while(it1.hasNext()) {
		Company co1=it1.next();
		if(co1.e.edepartment.equals("IT")) {
			System.out.println(co1.e.ename);
		}
	}
		
	}
void findCname(ArrayList<Company> al) {
	Iterator<Company>it2=	al.iterator();
	while(it2.hasNext()) {
		Company co2=it2.next();
		if(co2.cname.equalsIgnoreCase("Googal")) {
			System.out.println(co2);
		}
	}
}
void findcLocation(ArrayList<Company> al) {
	Iterator<Company>it3=	al.iterator();
	while(it3.hasNext()) {
		Company co3=it3.next();
		if(co3.location.equalsIgnoreCase("Bombay")) {
			System.out.println(co3);
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		ArrayList<Company> al=new ArrayList<>();
		al.add(c);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		CompanyMain cp=new CompanyMain();
		cp.findNameE(al);
		System.out.println("--------------");
		cp.findDepartmentE(al);
		System.out.println("--------");
		cp.findCname(al);
		System.out.println("------------");
		cp.findcLocation(al);
		
		

	}

}
