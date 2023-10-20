package Comparabl_ComparatorArrayList_sorting;

public class Employe4 implements Comparable<Employe4>{
	int id;
	String name;
	int age;
	public Employe4(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employe4 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employe4 o) {
		if(this.age<o.age)
			return 1;
		else if(this.age>o.age)
			return -1;
		else
		return 0;
	}
	
	

}
