package Comparabl_ComparatorArrayList_sorting;

public class SortInteger implements Comparable<SortInteger>{
	int id;
	String name;
	public SortInteger(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "SortInteger [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(SortInteger o) {
		// TODO Auto-generated method stub
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
		return 0;
	}
	

}
