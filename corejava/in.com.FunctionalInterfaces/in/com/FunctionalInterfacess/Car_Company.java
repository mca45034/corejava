package in.com.FunctionalInterfacess;

interface Car{
	public void Disp(String car,String color,String type);
}
public class Car_Company {

	public static void main(String[] args) {
		Car c=new Car() {
			
			@Override
			public void Disp(String car, String color, String type) {
				System.out.println("Car name is..."+car);
				System.out.println("car color is..."+color);
				System.out.println("car type is..."+type);
				
			}
		};
		c.Disp("Audi", "black", "EV");
		

	}

}
