package in.com.corejavaCello_Cloning;


public class Student {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student1 s=new Student1("sham", 101);
		Student1 s1=(Student1) s.clone();
		s1.name="ram";
		s1.id=201;
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s1.name);
		System.out.println(s1.id);
	}

}
