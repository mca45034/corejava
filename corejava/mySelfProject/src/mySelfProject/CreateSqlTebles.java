package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSqlTebles {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		Statement st=con.createStatement();
//		String sql="create table run(id int primary key,d_name varchar(25),age int)";
//		st.execute(sql);
//		System.out.println("done");
		int i=st.executeUpdate("insert into run (id,d_name,age)values(208,'olg',34)");
		System.out.println(i);
		System.out.println("done");
	}

}
