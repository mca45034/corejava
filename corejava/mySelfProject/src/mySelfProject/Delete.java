package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		Statement st=con.createStatement();
		int i=st.executeUpdate("delete from shows where id=101");
		System.out.println(i+ " record insret");

	}

}
