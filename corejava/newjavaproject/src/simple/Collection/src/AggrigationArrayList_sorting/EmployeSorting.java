package AggrigationArrayList_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeSorting implements Comparable<EmployeSorting>{
	int id;
	String name;
	int marks;
	

	public EmployeSorting(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "EmployeSorting [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(EmployeSorting o) {
		if(this.marks<o.marks) 
			return 1;
		else if(this.marks>o.marks)
			return -1;
		else
			return 0;
		
	}


	public static void main(String[] args) {
		ArrayList<EmployeSorting> al=new ArrayList<>();
		
		EmployeSorting e=new EmployeSorting(101, "sham", 80);
	    al.add(e);
	    al.add(new EmployeSorting(102,"Ram",70));
	    al.add(new EmployeSorting(103,"Raj",90));
	    al.add(new EmployeSorting(104,"pooja",50));
	    al.add(new EmployeSorting(105,"zack",85));
	    al.add(new EmployeSorting(106,"bob",79));
	    Collections.sort(al);
	   Iterator<EmployeSorting> it=al.iterator();
	   if(it.hasNext()) {
		   EmployeSorting e1= it.next();
		   System.out.print(e1);
	   }
	   
	   
	}
}
