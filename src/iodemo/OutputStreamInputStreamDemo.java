package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamInputStreamDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\temp\\mydatasat.txt");
		f.createNewFile();

		// java --data--> file [write][output] [FileOutputStream]
		// java <---data-- file [ read] [input][FileInputStream]

		// write data into file
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write('R');
//		fos.write('o');
//		fos.write('y');
//		fos.write('a');
//		fos.write('l');
//		fos.close();
//		System.out.println("writing..completed...");

		//
		FileInputStream fis = new FileInputStream(f);
		// read() -1 -> EoF
//		int b = fis.read();// byte R A->65
//		System.out.println((char)b);
//		fis.close();
//		

		int b = 0;
		while (true) {
			b = fis.read();
			if (b == -1) {
				break;
			}

			System.out.print((char) b);
		}
		fis.close();

	}
}
