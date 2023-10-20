package in.co.Calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice of distance today to anothe day inter day....");
		int s=sc.nextInt();
		Calendar cal=Calendar.getInstance();
		//cal.add(Calendar.DATE,s);
//		Date date=cal.getTime();
//		System.out.println(date);
//		SimpleDateFormat sdf=new SimpleDateFormat();
//		String str=sdf.format(date);
		//System.out.println(str);
		cal.add(Calendar.JANUARY,s);
		Date date2=cal.getTime();
		System.out.println(date2);
		cal.add(Calendar.FEBRUARY, s);
		cal.add(Calendar.MARCH, s);
		cal.add(Calendar.APRIL, s);
		cal.add(Calendar.MAY, s);
		cal.add(Calendar.JUNE ,s);
		cal.add(Calendar.JULY, s);
		cal.add(Calendar.AUGUST, s);
		cal.add(Calendar.SEPTEMBER, s);
		cal.add(Calendar.OCTOBER, s);
		cal.add(Calendar.NOVEMBER, s);
		cal.add(Calendar.DECEMBER, s);
		Date date1=cal.getTime();
		System.out.println(date1);
		

	}

}
