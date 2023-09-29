package Default_Constructar;

public class Emp {
	String name;
	int id;
	
	public void disp() {
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Emp e=new Emp();
		e.id=101;
		e.name="sham";
		e.disp();
	}

}
