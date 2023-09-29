package Get_Set;

public class ConstructarOverload_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructarOverload c=new ConstructarOverload();
		System.out.println(c.id);
		ConstructarOverload c1=new ConstructarOverload(112,"Dev");
		System.out.println(c1.id+" "+c1.name);
		
		ConstructarOverload c2 = new ConstructarOverload(125,"ramesh",3400.89);
		System.out.println(c2.id+" "+c2.name+" "+c2.salary);

	}

}
