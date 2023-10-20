 package in.com.Aggrigation_AComparator_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student_Main {
	int id;
	String name;
	int fee;
	

	public Student_Main(int id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	


	@Override
	public String toString() {
		return "Student_Main [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	public static void main(String[] args) {
		ArrayList<Student_Main>al=new ArrayList<>();
		Student_Main sm=new Student_Main(101, "sham", 1200);
		Student_Main sm1=new Student_Main(202, "alex", 5000);
		Student_Main sm2=new Student_Main(99, "ram", 15000);
		Student_Main sm3=new Student_Main(112, "dev", 4355);
		al.add(sm);
		al.add(sm1);
		al.add(sm2);
		al.add(sm3);
		System.out.println("------sort id------");
		Collections.sort(al,new SortId());
		Iterator<Student_Main>it=al.iterator();
		while(it.hasNext()) {
			Student_Main s=it.next();
			System.out.println(s);
		}
		System.out.println("------sort name-----");
		Collections.sort(al,new SortName());
		Iterator<Student_Main>it1=al.iterator();
		while(it1.hasNext()) {
			Student_Main s=it1.next();
			System.out.println(s);
		}
		

	}

}
