package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		Statement st=con.createStatement();
		int i=st.executeUpdate("update shows set s_name='rahul' where s_name='ram' ");
		System.out.println(i+" update record..");

	}

}
