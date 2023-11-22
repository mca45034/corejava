package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("connection is esteblish");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from print where id=3");
		rs.next();
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String last_name=rs.getNString("last_name");
		String address=rs.getString("address");
		String mob_number=rs.getString("mob_number");
		String email=rs.getString("email");
		System.out.println(id+" "+name+" "+last_name+" "+address+" "+mob_number+" "+email);
		con.close();
		st.close();
		

	}

}
