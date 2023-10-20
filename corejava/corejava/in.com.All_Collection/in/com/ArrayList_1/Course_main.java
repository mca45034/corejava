package in.com.ArrayList_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Course_main {
	ArrayList<Course> al=new ArrayList<Course>();
	void maxFee(ArrayList<Course>al) {
		Course c=al.get(0);
		int max=c.getFee();
		int a=0;
		String s=null;
		System.out.println("============================================");
		System.out.println(" !!! School name is.. : "+Course.getSname()+" !!!");
		System.out.println("============================================");
		for (int i = 1; i <al.size(); i++) {
			Course c1=al.get(i);
			if(c1.getFee()>max) {
				max=c1.getFee();
				a=c1.getId();
				s=c1.getName();
			}
			
		}
		System.out.println("Course id..."+a);
		System.out.println("Course name is.."+s);
		System.out.println("Course maximum salary..."+max);
	}
	void disp(ArrayList<Course>al) {
		Iterator<Course>it=al.iterator();
	
		while(it.hasNext()) {
			Course ce=it.next();
			System.out.println(ce);
		}
	}

	public static void main(String[] args) {
		Course_main cm=new Course_main();
		Course c1=new Course();
		c1.setId(101);
		c1.setName("java");
		c1.setFee(1200);
		
		Course c2=new Course();
		c2.setId(106);
		c2.setName("c++");
		c2.setFee(1500);
		Course c3=new Course();
		c3.setId(109);
		c3.setName("php");
		c3.setFee(1300);
		ArrayList<Course> al=new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		cm.maxFee(al);
		System.out.println("----------------------------------");
		cm.disp(al);

	}

}
