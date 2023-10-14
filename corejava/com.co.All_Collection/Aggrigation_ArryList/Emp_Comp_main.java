package Aggrigation_ArryList;

import java.util.ArrayList;
import java.util.Iterator;

public class Emp_Comp_main {
	ArrayList<Company1>al=new ArrayList<>();
	void cheakCity(ArrayList<Company1>al) {
		Iterator<Company1>it=al.iterator();
		while(it.hasNext()) {
			Company1 c=it.next();
			if(c.clocation.equalsIgnoreCase("noida")) {
				System.out.println(c.cname+" "+c.e.eid+" "+c.e.ename+" "+c.e.salary+" "+c.e.departmnet);
			}
		}
	}
	
	void cheakCompany(ArrayList<Company1>al) {
		Iterator<Company1>it=al.iterator();
		while(it.hasNext()) {
			Company1 cm2=it.next();
			if(cm2.cname.equalsIgnoreCase("hcl")) {
				System.out.println(cm2.e.eid+" "+cm2.e.ename+" "+cm2.e.departmnet+" "+cm2.e.salary+" "+cm2.clocation);
			}
		}
	}
	void cheakName(ArrayList<Company1>al) {
		Iterator<Company1>it=al.iterator();
		while(it.hasNext()) {
			Company1 cm3=it.next();
			if(cm3.e.ename.equalsIgnoreCase("sham")) {
				System.out.println(cm3.cname+" "+cm3.clocation+" "+cm3.e.eid+" "+cm3.e.departmnet+" "+cm3.e.salary);
			}
		}
	}
	public static void main(String[] args) {
		Emp_Comp_main emp=new Emp_Comp_main();
		Employe2 e=new Employe2(101, "sham", "it",12000);
		Employe2 e1=new Employe2(102, "sham", "hr",13000);
		Employe2 e2=new Employe2(103, "ram", "it", 12000);
		Employe2 e3=new Employe2(109, "alex", "testing",15000);
		Company1 c=new Company1("hcl", "noida", e);
		Company1 c1=new Company1("infosys", "noida", e1);
		Company1 c2=new Company1("hcl", "indore", e2);
		Company1 c3=new Company1("maicrosoft", "indore", e3);
		ArrayList<Company1>al=new ArrayList<>();
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println("searching city wise...");
		emp.cheakCity(al);
		
		System.out.println("-------------------");
		System.out.println("searching company name wise...");
		emp.cheakCompany(al);
		
		System.out.println("-----------------");
		System.out.println("Searching employe name wise..");
		emp.cheakName(al);
		
		
	}

}
