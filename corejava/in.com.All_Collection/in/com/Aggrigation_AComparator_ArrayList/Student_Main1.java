package in.com.Aggrigation_AComparator_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class  Student_Main1{
	 int id;
	 String name;
	 int fee;
	public Student_Main1(int id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getFee() {
//		return fee;
//	}
//	public void setFee(int fee) {
//		this.fee = fee;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Main1 s=new Student_Main1(010, "sham", 235);
		Student_Main1 s1=new Student_Main1(017, "aham", 435);
		Student_Main1 s2=new Student_Main1(045, "yham", 6635);
		Student_Main1 s3=new Student_Main1(19, "mham", 035);
		ArrayList<Student_Main1>al=new ArrayList<>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al, new SortName1());
		System.out.println(al);

	}

}
