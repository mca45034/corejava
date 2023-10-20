package Comparabl_ComparatorArrayList_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorEmployeMain {
	int id;
	String name;
	String hobby;
	

	public ComparatorEmployeMain(int id, String name, String hobby) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "ComparatorEmployeMain [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ComparatorEmployeMain> al=new ArrayList<>();
		ComparatorEmployeMain c=new ComparatorEmployeMain (01, "Sham", "KhoKho");
		ComparatorEmployeMain c1=new ComparatorEmployeMain (02, "Ram", "Hocky");
		ComparatorEmployeMain c2=new ComparatorEmployeMain (03, "Lucky", "Cricket");
		ComparatorEmployeMain c3=new ComparatorEmployeMain (04, "Zack", "VollyBoll");
		ComparatorEmployeMain c4=new ComparatorEmployeMain (05, "Monu", "Race");
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		
		Collections.sort(al,new SortEmployeName());
		Iterator<ComparatorEmployeMain> it=al.iterator();
		while(it.hasNext()) {
			ComparatorEmployeMain cm=it.next();
			System.out.println(cm);
		}
		System.out.println("----------------");
		Collections.sort(al,new SortEmpliyeHobby());
		Iterator<ComparatorEmployeMain> it1=al.iterator();
		while(it1.hasNext()) {
			ComparatorEmployeMain cm1=it1.next();
			System.out.println(cm1);
		}
		
		
		

	}

}
