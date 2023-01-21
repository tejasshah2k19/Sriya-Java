package exceptiond;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);//java api  nextInt() -> int 
		System.out.println("enter email");
		String email = scr.next();
		if(!email.contains("@gmail.com")) {
			EmailException e = new EmailException();
			throw e;
		}
		System.out.println(email);
	}
}

//log in with google

//amazon -> email pwd [ google] -> GoogleApi.authenticate(email,password) -> true | false 
//flipkart -> email pwd [ google] -> GoogleApi.authenticate(email,password) -> true | false 



//abc.com -> 50000  -> paypalApi ->   debit 50000 CC , credit 50000 BA s

//ISFA  -> 50000 


//Amazon
//GoogleApi 
//InvalidEmailException 