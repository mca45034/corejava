package in.com.Singal_Leval;
 class Shap{
	String color1;
	int border;
	public String getColor1() {
		return color1;
	}
	public void setColor1(String color1) {
		this.color1 = color1;
	}
	public int getBorder() {
		return border;
	}
	public void setBorder(int border) {
		this.border = border;
	}
	public void disp() {
		System.out.println(color1);
		System.out.println(border);
	}
	 
	
}
  class Ractangle extends Shape {
 String color;
	int width;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void disp2() {
		System.out.println(color);
		System.out.println(width);
	}

	

	
	
	
}

public class Lcd_main{
	public static void main(String[] args) {
    Ractangle r=new Ractangle();
   r.setColor("red");
   r.setBordertWith(90);
   r.setWidth(67);
   //r.setColor1("blue");
   r.disp1();
   r.disp2();
    
		
	}
}