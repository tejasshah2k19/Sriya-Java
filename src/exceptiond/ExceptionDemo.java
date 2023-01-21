package exceptiond;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two number");
		int a;
		int b;
		int c = 0;
		/*
		 * File f = new File("t.txt"); f.createNewFile();
		 */
		try {
			a = scr.nextInt();//te
			b = scr.nextInt();
			c = a / b;// /0 -> ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Please Do not enter Zero..");
		}
		// catch (InputMismatchException e) {
		// System.out.println("Please enter integers-whole digit only...");
		// }
		catch (Exception e) {
			System.out.println("SMW");
			// sendmailtodev(xx);
			e.printStackTrace();
		}finally {
			System.out.println("i am always..execute...");
		}

		System.out.println(c);
	}
}
