package SynchronizedS;
class Account{
	private int balance;
	public Account() {
		
	}
	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}
	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void Diposit(String name,int amount) {
		int total=amount+getBalance();
		setBalance(total);
		System.out.println(name+"    "+getBalance());
	}
}
class Racing extends Thread{
	String name;
	 static Account ac=new Account();
	public Racing(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.ac.Diposit(getName(), 1000);
		}
	}
}
public class Account_main {

	public static void main(String[] args) {
		Racing r=new Racing(null);
		r.setName("sham");
		Racing r2 =new Racing(null);
		r2.setName("Dev");
		r.start();
		r2.start();

	}

}
