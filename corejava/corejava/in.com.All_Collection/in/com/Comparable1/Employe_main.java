package in.com.Comparable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employe_main {

	public static void main(String[] args) {
		Employee e=new Employee(101, "dev", "indore",1234565);
		Employee e1=new Employee(231, "sham", "dewas",8764565);
		Employee e2=new Employee(987, "alex", "pune",878765565);
		Employee e3=new Employee(112, "lenow", "bhopal",252533565);
		ArrayList<Employee>al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);
		//System.out.println(al);
		Iterator<Employee>it=al.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp);
		}
				
		

	}

}
