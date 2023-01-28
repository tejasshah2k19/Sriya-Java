package datecalformat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatLocal {

	public static void main(String[] args) {
		DateFormat df1 = null;
		// 1,00,000
		// 100,000
		// 1.2
		// 1,2
		DateFormat df = DateFormat.getDateInstance();

		Date d = new Date();// current
		Date d1 = new Date(10);// 1-jan-1970 [10ms]

		System.out.println(d);
		System.out.println(df.format(d));

//		Locale usa = new Locale("EN", "USA");
//		Locale usa = new Locale("fr");

		Locale usa = new Locale("hi", "in");

		df = DateFormat.getDateInstance(DateFormat.SHORT, usa);
		System.out.println("short => " + df.format(d));

		df = DateFormat.getDateInstance(DateFormat.MEDIUM, usa);
		System.out.println("medium => " + df.format(d));

		df = DateFormat.getDateInstance(DateFormat.LONG, usa);
		System.out.println("long => " + df.format(d));

		df = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println("full => " + df.format(d));

		System.out.println(usa.getDisplayCountry());
		System.out.println(usa.getDisplayLanguage());

		NumberFormat nf = NumberFormat.getInstance(); // currency and locale

		df = DateFormat.getDateInstance(DateFormat.MEDIUM, usa);
		String str = "२८ जनवरी, २०२३";
		try {
			Date dd = df.parse(str); // ParseException
			System.out.println(dd);
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}
}
