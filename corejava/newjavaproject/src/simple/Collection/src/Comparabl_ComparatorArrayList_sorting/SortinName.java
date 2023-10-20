package Comparabl_ComparatorArrayList_sorting;

public class SortinName implements Comparable<SortinName> {
	String name;
	String item;
	public SortinName(String name,String item) {
		this.name=name;
		this.item=item;
	}
	@Override
	public String toString() {
		return "SortinName [name=" + name + ", item=" + item + "]";
	}
	@Override
	public int compareTo(SortinName o) {
		
		return (o.name.compareTo(this.name));
	}
	

}
