package com.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.DBConections;
import com.pojo.Booking;




public class  BookingImp implements RecordsBooking {
	Connection con;
	Booking booked=new Booking();
	public BookingImp() throws ClassNotFoundException, SQLException
	{
		con= DBConections.getConnection();
		
	}
	@Override
	public boolean insert() throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into booking values(?,?,?,?,?,?)");
		ps.setInt(1,booked.getBooking_id() );
		ps.setInt(2, booked.getPerson_id());
		ps.setInt(3, booked.getCity_id());
		ps.setInt(4, booked.getState_id());
		ps.setInt(5, booked.getCenter_id());
		ps.setInt(6, booked.getSlot_id());
       int x=ps.executeUpdate();
		
		if(x==1)
			return true;
		else
			return false;
		
		
	}

	

	@Override
	public void view() throws SQLException {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from bookings");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
		}
		
		
	}

}
