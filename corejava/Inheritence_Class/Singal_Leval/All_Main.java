package Singal_Leval;

public class All_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.setBordertWith(12);
		s.setColor("red");
		s.disp1();
		Rect r=new Rect();
		r.setLength(10);
		r.setWidth(12);
		r.disp();
Triangle t=new Triangle();
		
		t.setHigth(5);
		
		t.setWidth1(15);
		t.disp();

	}

}
class Shape1{
	String color;
	int borderWidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public void disp() {
		System.out.println("i am perent shape class...");
	}
	
}
class Rect extends Shape1{
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void disp() {
		int r= getWidth()* getLength();
		System.out.println("ractangle...."+r);
	}
	
}
class Triangle extends Rect{
	int higth;
	int width1;
	
	public int getHigth() {
		return higth;
	}

	public void setHigth(int higth) {
		this.higth = higth;
	}

	public int getWidth1() {
		return width1;
	}

	public void setWidth1(int width1) {
		this.width1 = width1;
	}

	public void disp() {
		double t=getHigth() * getWidth1();
		System.out.println("triangle");
	}
}
