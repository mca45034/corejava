package Core_java;
 class Student3 {


	int rollno;
	String name;
	int marks;
	

	public float calpercent(int marks) {
	return (marks * 100) / 20;

	}
	}


public class Question16 {
	


	public static void main(String[] args) {
		Student3 s=new Student3();
		s.calpercent(12);

	}

}
