package Joins1;
class Passport implements Runnable{
	Thread t;
	 Passport() throws InterruptedException {
		t=new Thread(this, "Passport");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("Please varification youre documents...");
		
	}
}
class Cheak12 implements Runnable{
	Thread t;
	String name;
	String location;
	int phonNo;
	int adharNo;
	 Cheak12(String name, String location, int phonNo, int adharNo) throws InterruptedException {
		super();
		this.name = name;
		this.location = location;
		this.phonNo = phonNo;
		this.adharNo = adharNo;
		t=new Thread(this, "Cheak");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println("please wait youre documents verifing...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println(name+" name is... "+name);
		 System.out.println(name+" location is... "+location);
		 System.out.println(name+" phone number is... "+phonNo);
		 System.out.println(name+" adhar number is... "+adharNo);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("!!! your document is verified.....");
		
	}
	
	
}
class Done implements Runnable{
	Thread t;
	 Done() throws InterruptedException {
		t=new Thread(this, "done");
		t.start();
		t.join();
	}
	@Override
	public void run() {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("!!! Document verified is DONE....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" !!!! youre pasport varification is Done");
		
	}
}


public class PassportVerification {

	public static void main(String[] args) throws InterruptedException {
		Passport p=new Passport();
		Cheak c=new Cheak("Sham", "pin-465687, Rajgarh", 546464664, 65464164);
		Done d=new Done();
		
	}

}
