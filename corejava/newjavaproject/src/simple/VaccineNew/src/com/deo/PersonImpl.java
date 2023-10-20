package com.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.DBConections;
import com.pojo.Person_details;


public class PersonImpl implements RecordPerson{
	Connection con;
	Person_details pers=new Person_details();
	public PersonImpl() throws ClassNotFoundException, SQLException
	{
		con= DBConections.getConnection();
		
	}
	@Override
	public boolean insert(Person_details pers) throws SQLException {
		PreparedStatement ps1=con.prepareStatement("insert into persons values(?,?,?,?,?,?)");
		ps1.setInt(1, pers.getPerson_id());
		ps1.setString(2, pers.getPerson_name());
		ps1.setString(3, pers.getPerson_DOB());
		ps1.setString(4, pers.getPerson_adhar());
		ps1.setString(5, pers.getPerson_phon());
		ps1.setString(6, pers.getPerson_address());
		 int x=ps1.executeUpdate();
			
			if(x==1)
				return true;
			else
				return false;
		
	}
	@Override
	public void view() throws SQLException {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from persons");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
		}
		
	}
}
