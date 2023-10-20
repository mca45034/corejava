package Aggrigation;

public class Item {
	int id;
	String name;
	int price;
	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
