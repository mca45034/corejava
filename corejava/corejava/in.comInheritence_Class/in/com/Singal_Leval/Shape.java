package in.com.Singal_Leval;

public class Shape {
	private String color;
	private int bordertWith;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBordertWith() {
		return bordertWith;
	}
	public void setBordertWith(int bordertWith) {
		this.bordertWith = bordertWith;
	}
	public  void disp1() {
		System.out.println("Shape Perents class......");
		System.out.println(color);
		System.out.println(bordertWith);
		
	}
	

}
