package Assigment_TreeMap;

public class Order implements Comparable<Order> {
	int o_Id;
	int o_Date;
	String l_Location;
	public Order(int o_Id, int o_Date, String l_Location) {
		super();
		this.o_Id = o_Id;
		this.o_Date = o_Date;
		this.l_Location = l_Location;
	}
	@Override
	public String toString() {
		return "Order [o_Id=" + o_Id + ", o_Date=" + o_Date + ", l_Location=" + l_Location + "]";
	}
	@Override
	public int compareTo(Order o) {
		
		return this.l_Location.compareTo(o.l_Location);
	}
	
}
