package Aggrigation;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class EmployeMain {

	public static void main(String[] args) {
		ArrayList<Employee1>al=new ArrayList<>();
		al.add(new Employee1(10,12000,"Aham"));
		al.add(new Employee1(12,15000,"Raam"));
		al.add(new Employee1(14,17000,"Pooja"));
		al.add(new Employee1(16,18000,"Dev"));
	    Collections.sort(al);
		Iterator<Employee1>it=al.iterator();
		while(it.hasNext()) {
			Employee1 emp=it.next();
			System.out.println(emp);
		}
		
		

	}

}
