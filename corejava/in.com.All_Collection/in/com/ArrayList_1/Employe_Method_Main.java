package in.com.ArrayList_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Employe_Method_Main {
	void maxSalary(ArrayList<Employe>al) {
		Employe em=al.get(1);
		int max=em.getE_salary();
		int a = 0;
		String s = null;
		System.out.println("Company name is..."+Employe.getName());
		for (int j = 1; j < al.size(); j++) {
			Employe emp=al.get(j);
			if(emp.getE_salary()>max) {
				max=emp.getE_salary();
				a=emp.getE_id();
				s=emp.getE_name();
			}
			
		}
		System.out.println("Employe id is : "+ a + "   Employe name is : "+ s + "  maximum salary.: " +max);
	}
	
	void disp(ArrayList<Employe>al)
	{
		System.out.println("-----------------------------");
		Iterator<Employe>it=al.iterator();
		System.out.println("Company name is..."+Employe.getName());
	 while(it.hasNext()) {
			Employe ep=it.next();
			System.out.println(ep);
		}
	}
		
	public static void main(String[] args) {
		Employe_Method_Main em=new Employe_Method_Main();
		Employe e1=new Employe();
		e1.setE_id(101);
		e1.setE_name("Sham");
		e1.setE_salary(15400);
		
		Employe e6=new Employe();
		e6.setE_id(100);
		e6.setE_name("Sham");
		e6.setE_salary(11000);
		
		Employe e2=new Employe();
		e2.setE_id(105);
		e2.setE_name("Dev");
		e2.setE_salary(12700);
		
		Employe e3=new Employe();
		e3.setE_id(120);
		e3.setE_name("lucy");
		e3.setE_salary(13400);
		
		Employe e5=new Employe();
		e5.setE_id(122);
		e5.setE_name("leks");
		e5.setE_salary(1900);
		
		Employe e4=new Employe();
		e4.setE_id(111);
		e4.setE_name("bobs");
		e4.setE_salary(16400);
		
		ArrayList<Employe> al=new ArrayList<Employe>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		em.maxSalary(al);
		em.disp(al);
		
		
		

	}

}
