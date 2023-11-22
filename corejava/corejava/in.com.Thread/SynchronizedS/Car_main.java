package SynchronizedS;
class Hr implements Runnable{
	Thread t;
	CarName c;
	public Hr(CarName c) {
		t=new Thread(this, "Hr");
		this.c=c;
		
	}
	@Override
	public void run() {
		c.CarHr();
		
	}
}
class Emp implements Runnable{
	Thread t;
	CarName c;
	public Emp(CarName c) {
		this.c=c;
		t=new Thread(this, "emp");
	}
	@Override
	public void run() {
		c.CarEmp();
	}
}
class CarName{
	public synchronized void CarHr() {
		String s=Thread.currentThread().getName();
		System.out.println(s+" car directer");
		try {
			wait();
			//notify();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void CarEmp() {
		String s1=Thread.currentThread().getName();
		System.out.println(s1+" car Employee");
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Car_main {

	public static void main(String[] args) {
		CarName ca=new CarName();
		Emp e=new Emp(ca);
		Thread t=new Thread(e, "Rahul");
		t.start();
		Emp e1=new Emp(ca);
		Thread t1=new Thread(e, "sham");
		t1.start();
		
		Emp e2=new Emp(ca);
		Thread t2=new Thread(e, "dev");
		t2.start();
		
		Hr h=new Hr(ca);
		Thread t4=new Thread(h, "Dr. losyes");
		t4.start();
		
		

	}

}
