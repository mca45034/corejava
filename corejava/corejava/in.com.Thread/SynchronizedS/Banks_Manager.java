package SynchronizedS;
class BranchManager implements Runnable{
	Balance b;Thread t;
	public BranchManager(Balance b) {
		this.b=b;
		t=new Thread(this, "Bank Manager");
	}
	@Override
	public void run() {
		b.Manager();
		
	}
}
class Customer implements Runnable{
	Balance b;Thread t;
	public Customer(Balance b) {
		this.b=b;
		t=new Thread(this, "customer deposit belence..");
	}
	@Override
	public void run() {
		b.deposit();
		
	}
}
class Balance {
	synchronized void Manager() {
		String s=Thread.currentThread().getName();
		System.out.println(s+" : Bank Manager");
		try {
		
			wait(2000);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("balance is diposit...");
		//notify();
		notifyAll();
	}
	synchronized void deposit() {
		try {
			wait();
			String s=Thread.currentThread().getName();
			System.out.println(s+" : 2000 deposit..");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class Banks_Manager {

	public static void main(String[] args) {
		Balance b=new Balance();
		Customer c=new Customer(b);
		Thread t=new Thread(c, "sham");
		t.start();
//		try {
//			t.wait(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		
		Customer c1=new Customer(b);
		Thread t1=new Thread(c1, "rahul");
		t1.start();
		
		Customer c2=new Customer(b);
		Thread t2=new Thread(c2, "ram");
		t2.start();
		BranchManager br=new BranchManager(b);
		Thread t4=new Thread(br, "Mr. lucy");
		t4.start();
		

	}

}
