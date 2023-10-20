package com.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import com.pojo.PersonUser;



public class VaccineMain {


	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException{
		Scanner sc=new Scanner(System.in);
			AllMethod a=new AllMethod();
			a.show1();
			a.show2();
			
		     a. date();
			//a.show3();
		PersonUser person=new PersonUser();
			person.pers();
	}

}
