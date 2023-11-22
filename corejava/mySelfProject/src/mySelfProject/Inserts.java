package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("connection esteblish");
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery("select*from)
		int i=st.executeUpdate("insert into shows(id,s_name,s_lastname,mob_number,city_name) values"
				+ "(101,'rahul','kirar',2345678901,'indore'),(102,'ram','kumar',9835678901,'pune'),"
				+ "(103,'sham','chawla',4445678901,'noida'),(104,'ankit','namdev',6665678901,'delhi')");
		System.out.println(i+"record Insert");

	}

}
