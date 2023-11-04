package SynchronizedS;
class Banks2 {
	
	private int balance;
	
	public Banks2() {
		// TODO Auto-generated constructor stub
	}
	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return balance;
	}


	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}


	public synchronized void Adding (String name,String location,int amount) {
		int total=getBalance()+amount;
		setBalance(total);
		System.out.println(name+" "+location+" "+getBalance());
	}
}
class Racefor extends Thread{
	String name;String location;
	public Racefor(String name,String location) {
		this.name=name;
		this.location=location;
	}
	static Banks2 b=new Banks2();
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.b.Adding(name, location, 100);
			
		}
		
	}
	
	
}
public class Bank_Main {

	public static void main(String[] args) {
		Racefor  r=new Racefor("sham", "indore");
		r.start();
		Racefor r1=new Racefor("ram", "pune");
		r1.start();

	}

}

