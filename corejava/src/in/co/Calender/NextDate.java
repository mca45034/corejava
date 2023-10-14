package in.co.Calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDate {
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		cal.add(Calendar.DATE, 9);
		Date date=cal.getTime();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat();
		String str=sdf.format(date);
		System.out.println(str);	
	}

}
