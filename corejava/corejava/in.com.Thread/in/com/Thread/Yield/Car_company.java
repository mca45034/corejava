package in.com.Thread.Yield;
class Car1 implements Runnable{
	String name;
	public Car1(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" "+name);
			Thread.yield();
			
		}
		
	}
}
class Car2 implements Runnable{
	String name;
    public Car2(String name) {
		this.name=name;
	}	
    @Override
    public void run() {
    	String s1=Thread.currentThread().getName();
    	
    	for (int i = 0; i < 5; i++) {
    		System.out.println(s1+" "+name);
    		Thread.yield();
			
		}
    	
    }
}

public class Car_company {

	public static void main(String[] args) {
		Runnable r;
		r=new Car1("audi");
		Thread t=new Thread(r, "car1");
		t.getPriority();
		t.start();
		
		r=new Car2("tata");
		Thread t1=new Thread(r, "car2");
		t1.getPriority();
		t1.start();
	}

}
