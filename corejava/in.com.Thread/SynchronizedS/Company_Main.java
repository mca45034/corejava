package SynchronizedS;
class Company_Hr implements Runnable{
	Thread t;
	Company c;
	public Company_Hr(Company c) {
		this.c=c;
		t=new Thread(this, "Company_Hr");
		
		
	}
	@Override
	public void run() {
		c.Hr();
		
	}
	
}
class Company_Employee implements Runnable{
	Thread t;
	Company c;
	public Company_Employee(Company c) {
		this.c=c;
		t=new Thread(this, "Company_Employee");
	}
	@Override
	public void run() {
		c.Employe();
		
	}
	
}
 class Company {
	 public synchronized void Hr() {
		 String s=Thread.currentThread().getName();
		 System.out.println(s+"  this is company HR..");
		 try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 //System.out.println("Employee are join company....");
		 
		 
	 }
	 public synchronized void Employe() {
		 String s1=Thread.currentThread().getName();
		 System.out.println(s1+" this is Employee....");
		 try {
			 wait(1500);
			 notifyAll();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 //System.out.println("i am employee !!!");
		
	 }
 }
public class Company_Main {

	public static void main(String[] args) {
		Company  com=new Company();
		Company_Employee emp=new Company_Employee(com);
		Thread t=new Thread(emp, "Rahul");
		t.start();
		
		Company_Employee emp1=new Company_Employee(com);
		Thread t1=new Thread(emp1, "Ankit");
		t1.start();
		
		Company_Employee emp2=new Company_Employee(com);
		Thread t2=new Thread(emp2, "Nitish");
		t2.start();
		
		Company_Hr hr=new Company_Hr(com);
		Thread t4=new Thread(hr, "Mr. Arun Jha");
		t4.start();
		

	}

}
