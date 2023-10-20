package TreeMap123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentValueMain {

	public static void main(String[] args) {
		HashMap<Student,Course>hm=new HashMap<>();
		ArrayList<Course>al=new ArrayList<>();
		LinkedHashMap<Student,Course>lm=new LinkedHashMap<>();
		Student s=new Student(101,"Kiran");
		Student s1=new Student(101,"pooja");
		Student s2=new Student(101,"ram");
		Student s3=new Student(101,"sham");
		
		Course c=new Course("java",1200);
		Course c1=new Course("c++",1000);
		Course c2=new Course(".net",1500);
		Course c3=new Course("python",1100);
		hm.put(s, c);
		hm.put(s1, c1);
		hm.put(s2, c2);
		hm.put(s3, c3);
		Collection<Course>col=hm.values();
		Iterator<Course>it=col.iterator();
		while(it.hasNext()) {
			Course cor=it.next();
			al.add(cor);
			
			
		}
		Collections.sort(al);
		System.out.println(al);
		Iterator<Course>it1=al.iterator();
		while(it1.hasNext()) {
			Course cor1=it1.next();
			Set<Entry<Student,Course>>set=hm.entrySet();
			for(Map.Entry<Student,Course>map:set) {
				Course cor2=map.getValue();
				if(cor1.price==cor2.price)
				{
					Student st1=map.getKey();
					lm.put(st1, cor2);
					
				}
				
				
			}
		}
		System.out.println(lm);
		
		

	}

}
