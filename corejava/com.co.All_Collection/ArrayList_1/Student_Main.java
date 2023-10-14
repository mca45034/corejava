package ArrayList_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student_Main {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		//List<Student>l=new ArrayList<>();
		Student s=new Student(101, "Sham", 2300.5f);
		al.add(s);
		al.add(new Student(102,"Rahul", 2323.5f));
		al.add(new Student(109,"lucy", 2345.5f));
		al.add(new Student(105,"dev", 2367.5f));
		al.add(new Student(103,"Rahul", 2323.5f));
		al.add(new Student(107,"ram", 2323.5f));
		Iterator<Student>it=al.iterator();
		Iterator<Student>it1=al.iterator();
//		while(it.hasNext()) {
//			Student s1=it.next();
//			if(s1.name.equals("Rahul")) {
//				System.out.println(s1);
//			}
//			
//		}
		while(it1.hasNext()) {
			Student s2=it1.next();
			if(s2.fee>2345) {
				System.out.println(s2);
			}
			
		}
		
		
		

	}

}
