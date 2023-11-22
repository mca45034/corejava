package in.com.Hash_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Dep_Employee_Main {

	public static void main(String[] args) {
		HashSet<Employee23>hs=new HashSet<>();
		Department dep=new Department(10, "it", 12000);
		Department dep1=new Department(15, "coder", 12500);
		Department dep2=new Department(9, "qa", 13000);
		Department dep3=new Department(8, "hr", 19000);
		
		
		Employee23 em=new Employee23(121, "sham", dep);
		Employee23 em2=new Employee23(119, "lucy", dep1);
		Employee23 em3=new Employee23(110, "dev", dep2);
		Employee23 em4=new Employee23(125, "zoffer", dep3);
		hs.add(em);
		hs.add(em2);
		hs.add(em3);
		hs.add(em4);
		System.out.println("====employee id sort===");
//		TreeSet<Employee23>ts=new TreeSet<>(hs);
//		Iterator<Employee23>it=ts.iterator();
//		while(it.hasNext()) {
//			Employee23 empl=it.next();
//			System.out.println(empl);
//		}
		TreeSet<Employee23>ts=new TreeSet<>(new SortEmpId ());
		
		ts.addAll(hs);
		Iterator<Employee23>it=hs.iterator();
		while(it.hasNext()) {
			Employee23 empl=it.next();
			System.out.println(empl);
		
		}
		System.out.println("------------------------");
		TreeSet<Department>ts2=new TreeSet<>(new DepSortName());
		
		ts.addAll(hs);
		Iterator<Employee23>it2=hs.iterator();
		while(it.hasNext()) {
			Employee23 empl=it.next();
			System.out.println(empl);
		
		
		}

	}

}
