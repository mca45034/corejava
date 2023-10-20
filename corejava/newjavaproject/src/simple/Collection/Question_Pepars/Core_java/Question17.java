package Core_java;

 class Thread2 {
	void show() {
	
	System.out.println("i am thread class");
	}
	
}

 class TestThread extends Thread2 {
	void show() {
		System.out.println("i am chaild");
	}
}

public class Question17 {

			public static void main(String args[]){

			TestThread t = new TestThread();
			System.out.println("Before starting thread");
			t.show();

			System.out.println("After starting thread");

			

			}

	}


