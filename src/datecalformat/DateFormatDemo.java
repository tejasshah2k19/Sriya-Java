package datecalformat;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
		DateFormat df1 = null;

		DateFormat df = DateFormat.getDateInstance();

		Date d = new Date();// current
		Date d1 = new Date(10);// 1-jan-1970 [10ms]

		System.out.println(d);
		System.out.println(df.format(d));

		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short => "+df.format(d));

		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("medium => "+df.format(d));

		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("long => "+df.format(d));

		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("full => "+df.format(d));

	}
}

//class XXX extends DateFormat{
//}