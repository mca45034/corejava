package march1;


import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
class Idsort implements Comparator<Train>{

	@Override
	public int compare(Train o1, Train o2) {
		
		return o2.p_name.compareTo(o1.p_name);
	}
	
}





class Train {
	int p_id;
	String p_name;
	int total_seat;
	Train(){
		
	}
	public Train(int p_id, String p_name, int total_seat) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.total_seat = total_seat;
	}
	
	@Override
	public String toString() {
		return "Train [p_id=" + p_id + ", p_name=" + p_name + ", total_seat=" + total_seat + "]";
	}
	
		
	
}

public class Question23 {

	public static void main(String[] args) {
		HashSet<Train>al=new HashSet<>();
		Train t=new Train(111,"Dev",12);
		Train t1=new Train(102,"Sham",14);
		Train t2=new Train(115,"pooja",28);
		Train t3=new Train(108,"nakul",125);
		Train t4=new Train(115,"shakshi",23);
		al.add(t);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		TreeSet<Train> tr = new TreeSet<>(new Idsort());
		tr.addAll(al);
		System.out.println(tr);
		
		
			
		

	}

}
