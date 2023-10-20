package AggrigationArrayList_sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CompretorStudent{
	int id;
	String name;
	int marks;
	
	public CompretorStudent(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "CompretorStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		ArrayList<CompretorStudent> al=new ArrayList<>();
		CompretorStudent c=new CompretorStudent(101,"Sham",60);
		al.add(c);
		al.add(new CompretorStudent(102,"Ram",70));
		al.add(new CompretorStudent(103,"John",90));
		al.add(new CompretorStudent(104,"Zack",50));
		al.add(new CompretorStudent(105,"Bob",75));
		al.add(new CompretorStudent(106,"pop",60));
		System.out.println("----sort marks------");
		Collections.sort(al,new StudentMarks());
		Iterator<CompretorStudent> it=al.iterator();
		while(it.hasNext()) {
			CompretorStudent c1=it.next();
			System.out.println(c);
		}
		System.out.println("------sort name----");
		Collections.sort(al,new StudentName());
		Iterator<CompretorStudent> it1= al.iterator();
		while(it1.hasNext()) {
			CompretorStudent c2=it1.next();
			System.out.println(c2);
		}
		System.out.println("-----sort id------");
		Collections.sort(al,new StudentId());
	Iterator<CompretorStudent> it3=	al.iterator();
	while(it3.hasNext()) {
		CompretorStudent c3=it3.next();
		System.out.println(c3);
	}
		
		

	}

}
