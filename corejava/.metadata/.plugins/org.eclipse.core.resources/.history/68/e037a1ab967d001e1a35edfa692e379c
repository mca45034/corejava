package in.com.Precties;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.com.connection.DBConnection;

class Student{
	private int s_id;
	private String s_name;
	private int age;
	public Student(int s_id, String s_name, int age) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.age = age;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class StudentImpl implements Record1{
	Connection con;
	Scanner sc=new Scanner(System.in);
	public StudentImpl() throws ClassNotFoundException, SQLException {
		con=DBConnection.getConnection();
	}

	@Override
	public boolean insert(Student s) throws Exception {
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, s.getS_id());
		ps.setString(2, s.getS_name());
		ps.setInt(3, s.getAge());
		int x=ps.executeUpdate();
		if(x==1) {
			return true;
		}
		else
			return false;
	}
	
}

public class Student_Main {
	Scanner sc=new Scanner(System.in);
	public void Disp() throws Exception {
		
		System.out.println("Enter the student id");
		int s_id=sc.nextInt();
		System.out.println("Enter the Student name");
		String s_name=sc.next();
		System.out.println("Enter the student age");
		int age=sc.nextInt();
		
		Record1 r=new StudentImpl();
		Student s;
		s=new Student(s_id, s_name, age);
		boolean t=r.insert(s);
		if(t==true) {
			System.out.println("record insert");
		}
		else {
			System.out.println("record not insert");
		}
	}

	public static void main(String[] args) throws Exception {
		Student_Main stu=new Student_Main();
		stu.Disp();
		

	}

}
