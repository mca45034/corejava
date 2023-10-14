package Aggrigation_ArryList;

public class Car {
	String type;
	int price;
	public Car(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", price=" + price + "]";
	}
	

}
