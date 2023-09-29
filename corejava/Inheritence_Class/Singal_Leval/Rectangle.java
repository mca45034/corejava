package Singal_Leval;

public class Rectangle extends Shape {
	private int length;
	private int width;
	private int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	private int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	public void disp2() {
		System.out.println("Rectangle child class....");
		System.out.println(length);
		System.out.println(width);
	}
	

}
