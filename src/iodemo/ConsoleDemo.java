package iodemo;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console c = System.console();
		System.out.println("Enter password--->");
		char password[] = c.readPassword();

		String str = new String(password);
		System.out.println(str);
		
		String str1 = c.readLine();
		System.out.println(str1);
		
		String str2 = c.readLine("Enter Data");

//		System.out.println("Enter data");
//		str2 = scr.nextLine();

	}
}
