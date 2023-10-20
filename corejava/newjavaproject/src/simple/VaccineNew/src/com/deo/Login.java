package com.deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.DBConections;

public class Login {
	static Connection con;
	public static void login2() throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your login details");
		System.out.println("Enter username ");
		String user=sc.next();
		System.out.println("Enter password");
		int pass=sc.nextInt();
		 con=DBConections.getConnection();
		String str="insert into login value(?,?)";
		PreparedStatement ps= con.prepareStatement(str);
		ps.setString(1, user);
		ps.setInt(2, pass);
		ps.executeUpdate();
		
		System.out.println("Verifying user name ");
		System.out.println("Please enter your username");
		

		String user1=sc.next();
		String str1= "select*from Login1";
		con.prepareStatement(str1);
		PreparedStatement ps1= con.prepareStatement(str1);
		ResultSet rs= ps1.executeQuery();
		while(rs.next()) {
			String user2=rs.getString(1);
			if(user1.equals(user2))
			{
			 System.out.println("welcome to Corona Vaccines app");	
			}
			else
			{
				System.out.println("Please enter correct username");
			}
		}
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Login log=new Login();
		log.login2();
	}


}
