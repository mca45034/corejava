package mySelfProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Select {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class c=Class.forName("com.mysql.cj.jdbc.Driver");
	    
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul?autoReconnect=true&useSSL=false", "root", "root");
		System.out.println("Connection established");
	
		Statement st=con.createStatement();
		
	ResultSet rs=	st.executeQuery("select * from employe where e_id=102");
	
	rs.next();
	int e_id=rs.getInt("e_id");
	String e_name=rs.getString("e_name");
	String e_lastname=rs.getString("e_lastname");
	String e_address=rs.getString("e_address");
	System.out.println(e_id+" "+e_name+" "+e_lastname+" "+e_address);
	
	st.close();
	con.close();
	
		
		
		
	}

}
