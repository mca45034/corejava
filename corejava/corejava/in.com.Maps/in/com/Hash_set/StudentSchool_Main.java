package in.com.Hash_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
class sortlocation implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.location.compareTo(o2.location);
		//return 0;
	}
	
}
public class StudentSchool_Main {

	public static void main(String[] args) {
		Student s=new Student(102, "ram", "noida");
		Student s1=new Student(104, "pamesh", "pune");
		Student s2=new Student(99, "dev", "indore");
		Student s3=new Student(114, "alexa", "colcata");
		Student s4=new Student(103, "hoks", "delhi");
		
		HashSet<Student>hs=new HashSet<Student>();
		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		System.out.println("sort by Student name.....");
		TreeSet<Student>ts=new TreeSet<Student>(new StudentName_sort());
		ts.addAll(hs);
		Iterator<Student>it=ts.iterator();
		while(it.hasNext()) {
			Student sc=it.next();
			System.out.println(sc);
		}
		System.out.println("sort by student location....");
		TreeSet<Student>ts1=new TreeSet<Student>(new sortlocation());
		ts1.addAll(hs);
		Iterator<Student>it1=ts1.descendingIterator();
		while(it1.hasNext()) {
			Student st1=it1.next();
			System.out.println(st1);
		}
		

	}

}
