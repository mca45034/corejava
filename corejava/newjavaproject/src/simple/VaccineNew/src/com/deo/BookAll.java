package com.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.connection.DBConections;

public class BookAll {

		Connection con;
		PreparedStatement ps;
		BookAll(){
			
		}
		public void BookShow(int person_id,int city_id,int state_id,int centre_id,int slot_id) throws ClassNotFoundException, SQLException {
			con=DBConections.getConnection();
			
			
			String sql="insert into bookings(person_id,city_id,state_id,centre_id,slot_id";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, person_id);
			ps.setInt(2, city_id);
			ps.setInt(3, state_id);
			ps.setInt(4, centre_id);
			ps.setInt(5, slot_id);
		}
		

		void Conformation(int person_id,int centre_id,int slot_id) throws SQLException {
			String sql="select person_name,centre_name,slot_starttime,slot_endtime";
			ps=con.prepareStatement(sql);
			ps.setInt(1, person_id);
			ps.setInt(2, centre_id);
			ps.setInt(3, slot_id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Congratulations...."+rs.getString(slot_id));
			}
		}
			public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException{
				BookAll boo=new BookAll();
				boo.BookShow(0, 0, 0, 0, 0);
				boo.Conformation(0, 0, 0);
		}



}
