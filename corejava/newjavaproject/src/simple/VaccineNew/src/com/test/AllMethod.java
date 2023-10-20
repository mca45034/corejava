package com.test;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.connection.DBConections;

public class AllMethod {
	String date2;
	Scanner sc=new Scanner(System.in);
	Connection con;
	public AllMethod() throws ClassNotFoundException, SQLException {
		con=DBConections.getConnection();
	}
	public void show1() throws SQLException {
		
		System.out.println("-----------state-------");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from state");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		System.out.println("Enter the your choice state");
		String state_name=sc.next();
		PreparedStatement ps=con.prepareStatement("select city_name\r\n"
				+ "from State u inner join City p\r\n"
				+ "on u.state_id=p.state_id\r\n"
				+ "where state_name=?;");
		ps.setString(1, state_name);
		ResultSet rs1=ps.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getString(1));
		}
	
		
	}
	
	
	
	
	
public void show2() throws SQLException {
		
		System.out.println("-----------City-------");
		Statement st=con.createStatement();
		ResultSet rs2=st.executeQuery("select * from Centers");
//		while(rs2.next()) {
//			System.out.println(rs2.getInt(1)+" "+rs2.getString(2));
//		}
		System.out.println("Enter the your choice city");
		String city_name=sc.next();
		PreparedStatement ps=con.prepareStatement(" select centre_name\r\n"
				+ " from City c inner join Centers ce\r\n"
				+ " on c.city_id=ce.city_id\r\n"
				+ " where city_name=?;");
		ps.setString(1, city_name);
		
		ResultSet rs3=ps.executeQuery();
		while(rs3.next()) {
			System.out.println(rs3.getString(1));
		}
		
		
	}
public void show3() throws SQLException {
	System.out.println("------slot------");
	System.out.println("There are slot time");
	
	Statement st=con.createStatement();
	ResultSet rs6=st.executeQuery("select*from Slot");
	
	while(rs6.next()) {
		System.out.println(rs6.getInt(1)+" "+rs6.getString(2)+" "+rs6.getString(3));
	}
	System.out.println("Enter the your choice slot");
	String slot_starttime=sc.next();
	PreparedStatement ps=con.prepareStatement(slot_starttime);
	ps.setString(1, slot_starttime);
	ResultSet rs7=ps.executeQuery();
	while(rs7.next()) {
		System.out.println(rs7.getString(1));
	}
	
	
}
public void date() throws SQLException, ParseException, ClassNotFoundException {
	int flage=0;
	System.out.println("Enter the date");
	
	 SimpleDateFormat d1=new SimpleDateFormat("yyyy-MM-dd");
	 String date1=sc.next();
	 java.util.Date d2 = d1.parse(date1);
	 
	 Statement st=con.createStatement();
		ResultSet rs6=st.executeQuery(" select * from Holiday ");
		
		while(rs6.next()) {
			rs6.getDate(2);
		int x=	rs6.getDate(2).compareTo(d2);
		if(x==0) {
			System.out.println("public holiday due to "+rs6.getString(3));
			
			System.out.println("Enter the date again ");
			 date2=sc.next();
			 d2=d1.parse(date1);
			 flage=1;
			
		}
		if(x !=0) {
			flage=0;
		}
	
		
		}
		if(flage==0) {
			AllMethod all=new AllMethod();
			all.show3();
			
		}

		
		 
		 
		
	 
}
	
	

}
