package in.co.rays.car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarModel {
	public void add(CarBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into car values(?,?,?)");
		ps.setInt(1, bean.getCar_id());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getPrice());
		int i=ps.executeUpdate();
		System.out.println("insert data.."+i);
		
	}
	public void update(CarBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps=conn.prepareStatement("update car set name=?,price=? where car_id=?");
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getPrice());
		ps.setInt(3, bean.getCar_id());
		int i=ps.executeUpdate();
		System.out.println("update data.."+i);
		
	}
	public void delete(CarBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps=conn.prepareStatement("delete from car where car_id=?");
		ps.setInt(1, bean.getCar_id());
		int i=ps.executeUpdate();
		System.out.println("delete record.."+i);
	}
	public List list() throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		PreparedStatement ps=conn.prepareStatement("select * from car");
		ResultSet rs=ps.executeQuery();
		List list=new ArrayList();
		while(rs.next()) {
			CarBean bean=new CarBean();
			bean.setCar_id(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setPrice(rs.getInt(3));
			list.add(bean);
		}
		
		return list;
		
	}

}
