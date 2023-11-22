package Joins1;
class Adhar implements Runnable{
	Thread t;
	public Adhar() throws InterruptedException {
		t=new Thread(this, "Adhar");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("please verified youre adhar card...");
		
	}
}
class Cheak implements Runnable{
	Thread t;
	String name;
	String location;
	int adharNo;
	int phoneNo;
	public Cheak(String name, String location, int adharNo, int phoneNo) throws InterruptedException {
		
		this.name = name;
		this.location = location;
		this.adharNo = adharNo;
		this.phoneNo = phoneNo;
		t=new Thread(this, "Cheak");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("please wait verifing youre adhar");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("person name is..."+name);
		System.out.println("person location is..."+location);
		System.out.println("person phone number is..."+phoneNo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("verification are completed...");
	}
	
}
class Link implements Runnable{
	Thread t;
	public Link() throws InterruptedException {
		t=new Thread(this, "Link");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("updating youre adhar card !!!!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("============================= ");
		System.out.println("!!!! youre adhar card is update !!!");
		System.out.println("==============================");
		
	}
}

public class AdharVerification {
	public static void main(String[] args) throws InterruptedException {
		Adhar a=new Adhar();
		Cheak c=new Cheak("rahul","indore", 235465763,867565657);
		Cheak c1=new Cheak("dev", "pune", 46846, 53653);
		Link l=new Link();
		
		
	}

	
}
