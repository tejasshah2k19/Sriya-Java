package iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("mydatasat.txt");

		FileWriter fw = new FileWriter(f);
		fw.write("royal");
		fw.write("\neducation");
		fw.write("\nAhmedabad 380015");
		fw.close();
		System.out.println("*****************");

		FileReader fr = new FileReader(f);
		int b = 0;

		while (true) {
			b = fr.read();
			if (b == -1)
				break;
			System.out.print((char) b);
		}
		fr.close();
	}
}
