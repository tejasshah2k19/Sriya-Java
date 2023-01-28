package datecalformat;

import java.util.Date;

public class DateApi {

	public static void main(String[] args) {
		//Date => util sql 
		
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getHours());
		System.out.println(d.getMonth());
	}
}
