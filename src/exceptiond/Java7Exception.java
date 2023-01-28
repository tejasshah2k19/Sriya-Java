package exceptiond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java7Exception {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int k = scr.nextInt();

		scr.close();

		// try with auto resource de. close
		// Closeable extends AC
		// AutoCloseable
		try (
					Scanner s = new Scanner(System.in);
				
				) {
		
			
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a/b;
			
		}catch(InputMismatchException | ArithmeticException e) {
			//
		}
		
		
		
	}
}
