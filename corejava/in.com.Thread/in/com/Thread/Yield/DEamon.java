package in.com.Thread.Yield;
class Thread1234 extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		if(t.isDaemon())
		{
			Employee e=new Employee(1,"ppoja");
			e.display();
		}
		else
			System.out.println("user Thread");
		
	}
}

class Employee
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("provide service to employee clas");
		System.out.println("id..."+id);
		System.out.println("name is..."+name);
	}
}

public class DEamon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1234 t=new Thread1234();
		t.isDaemon();
		t.start();

	}

}
