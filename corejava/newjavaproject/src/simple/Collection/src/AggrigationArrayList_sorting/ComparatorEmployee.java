package AggrigationArrayList_sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorEmployee {
	int id;
	String name;
	String departmnet;
	String location;
	int selary;
	public ComparatorEmployee(int id, String name, String departmnet, String location, int selary) {
		super();
		this.id = id;
		this.name = name;
		this.departmnet = departmnet;
		this.location = location;
		this.selary = selary;
	}

	@Override
	public String toString() {
		return "ComparatorEmployee [id=" + id + ", name=" + name + ", departmnet=" + departmnet + ", location="
				+ location + ", selary=" + selary + "]";
	}

	public static void main(String[] args) {
		ArrayList<ComparatorEmployee> all=new ArrayList<>();
		ComparatorEmployee emp=new ComparatorEmployee(201, "jecks", "HR","mumbai", 50000);
		all.add(emp);
		all.add(new ComparatorEmployee(202, "pops", "it","pune", 60000));
		all.add(new ComparatorEmployee(203, "sem", "co-ordinater","delhi", 40000));
		all.add(new ComparatorEmployee(204, "lucy", "Communicater","indore", 45000));
		all.add(new ComparatorEmployee(205, "jems", "gaidencer","Bhopal", 55000));
		all.add(new ComparatorEmployee(206, "ruby", "HR","mumbai", 58000));
		System.out.println("------sort name-----");
		Collections.sort(all,new EmployeName());
	Iterator<ComparatorEmployee> it=	all.iterator();
		while(it.hasNext()) {
			ComparatorEmployee c=it.next();
			System.out.println(c);
		}
		System.out.println("---------sort Location------");
		Collections.sort(all,new EmployeLocation());
	Iterator<ComparatorEmployee> it1=	all.iterator();
	while(it1.hasNext()) {
		ComparatorEmployee c1=it1.next();
		System.out.println(c1);
	}
	System.out.println("-------sort Department------");
	Collections.sort(all,new EmployeDepartment());
	Iterator<ComparatorEmployee>it2=all.iterator();
	while(it2.hasNext()) {
		ComparatorEmployee c2=it2.next();
		System.out.println(c2);
	}
	System.out.println("------sort selary-----");
	Collections.sort(all,new EmployeSelary());
	Iterator<ComparatorEmployee>it3=all.iterator();
	while(it3.hasNext()) {
		ComparatorEmployee c3=it3.next();
		System.out.println(c3);
	}
	
		

	}


}
