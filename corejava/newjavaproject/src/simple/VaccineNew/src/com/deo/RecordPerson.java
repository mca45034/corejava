package com.deo;

import java.sql.SQLException;

import com.pojo.Person_details;

public interface RecordPerson {
	 boolean insert(Person_details pers)throws SQLException ;
		
		void view()throws SQLException ;
}
