package com.pojo;

import java.sql.SQLException;
import java.util.Scanner;

import com.deo.RecordPerson;
import com.deo.PersonImpl;

public class PersonUser {
	
	public void pers() throws ClassNotFoundException, SQLException {
		String ans;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the option..");
			System.out.println("1. Add person detailes...");
			System.out.println("2. View person detailes..");
			System.out.println("Enter youre choice");
			int choice=sc.nextInt();
		
		RecordPerson re=new PersonImpl() ;
		Person_details pers;
		switch(choice) {
		
		case 1:{
		System.out.println("please enter person full details..");
		System.out.println("please enter person id..");
		int person_id1=sc.nextInt();
		System.out.println("please enter person name..");
		String person_name1=sc.next();
		System.out.println("please enter person dob..");
		String person_dob1=sc.next();
		System.out.println("please enter person addhar number..");
		String person_adhar1=sc.next();
		System.out.println("please enter person phone number..");
		String person_phone1=sc.next();
		System.out.println("please enter person address..");
		String person_address1=sc.next();
		pers=new Person_details(person_id1,person_name1,person_dob1,person_adhar1,person_phone1,person_address1);
		boolean bo=re.insert(pers);
		if(bo==true)
		{
			System.out.println("record inserted sucessfully");
		}
		else
			System.out.println("record does not inserted");
		}
		case 2:
			re.view();
			break;
		
		}
		System.out.println("do you want to  continue yes/no");
		 ans=sc.next();
		}while(ans.equalsIgnoreCase("yes"));
		
	}

	

}
