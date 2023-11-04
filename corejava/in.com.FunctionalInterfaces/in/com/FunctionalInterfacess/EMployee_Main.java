package in.com.FunctionalInterfacess;

 interface Employee{
	 
	public void Say(int id,String name);
}
interface Emp{
		public void Disp();
		
	}
 public class EMployee_Main{
	 public static void main(String[] args) {
		 Employee emp1=new Employee() {
			
			@Override
			public void Say(int id, String name) {
				System.out.println("employee id is...."+id);
				System.out.println("Employee name is..."+name);
				
			}
		};
		emp1.Say(101,"sham");
		
		 Emp e=new Emp() {
			
			@Override
			public void Disp() {
				System.out.println("i am second employee....");
				
			}
		};
		e.Disp();
		 
		 
		 
		
	}
	 
 }
