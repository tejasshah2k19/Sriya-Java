package datecalformat;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		
		c.add(Calendar.DATE, 10);
		System.out.println(c.get(Calendar.DATE));
		
		Date d = new Date(c.getTimeInMillis());
		System.out.println(d);

	
	
		c = Calendar.getInstance();
		c.roll(Calendar.DATE, 10);
		System.out.println(c.get(Calendar.DATE));
		
		d = new Date(c.getTimeInMillis());
		System.out.println(d);
	
	}
}
