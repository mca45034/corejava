package Method_Overloading;
class Student {
	void score() {
		System.out.println("Wel come to School....");
	}
	void score(String Name) {
		System.out.println("Student name is ...:"+Name);
	}
	void score (int rollNo,String Category) {
		System.out.println(rollNo);
		System.out.println(Category);
	}
}

public class Student_main {

	public static void main(String[] args) {
		Student s=new Student();
		s.score();
		s.score("sham");
		s.score(101, "pcm");

	}

}
