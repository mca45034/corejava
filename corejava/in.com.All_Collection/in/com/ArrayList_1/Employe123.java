package in.com.ArrayList_1;

import java.util.ArrayList;
import java.util.Iterator;

class Employe12 {
	int id;
	String name;
	int salary;
	public Employe12(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe123 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
public class Employe123{
	ArrayList<Employe12>al=new ArrayList<Employe12>();
	
	 int flage=0;
	public void  maxSalary(	ArrayList<Employe12>al) {
		Iterator<Employe12>it=al.iterator();
		while(it.hasNext()) {
			Employe12 emp=it.next();
			if(emp.salary>10000) {
				System.out.println(emp.id+" "+emp.name+" "+emp.salary);
			}
		}
		
		
	}
	public void searchEmploye(ArrayList<Employe12>al) {
		Iterator< Employe12>it=al.iterator();
		
		while(it.hasNext()) {
			Employe12 emp1=it.next();
			if(emp1.name.equals("sachin")) {
				System.out.println(emp1.name +": "+"employe is present : " );
				flage=1;
			}	
		}
		if(flage==1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
			}
	public static void main(String[] args) {
	ArrayList<Employe12>al=new ArrayList<Employe12>();
	al.add(new Employe12(101, "sham", 10000));
	al.add(new Employe12(901, "ram", 11000));
	al.add(new Employe12(99, "sachin", 9000));
	al.add(new Employe12(202, "pappu", 15000));
	al.add(new Employe12(98, "bhalu", 12000));
	Employe123  emps=new Employe123();
	emps.maxSalary(al);
	System.out.println("----------------");
	Employe123  emps1=new Employe123();
	emps1.searchEmploye(al);
	
		
	}
}
 