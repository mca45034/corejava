package in.co.Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calander1 {
	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		//System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
		String str=sdf.format(date);
		System.out.println(str);
		
		String date1="18/09/2023";
		SimpleDateFormat sdf1=new SimpleDateFormat(date1);
		Date str1=sdf1.parse(date1);
		System.out.println(str1);
	}

}
