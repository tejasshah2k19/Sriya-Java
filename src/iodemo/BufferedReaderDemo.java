package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("mydatasat.txt");

		FileWriter fw = new FileWriter(f);
		fw.write("royal");
		fw.write("\neducation");
		fw.write("\nAhmedabad 380015");
		fw.close();
		System.out.println("*****************");

		String str = "";
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			str = br.readLine();
			if (str == null)
				break;
			System.out.println(str);
		}

		fr.close();
	}
}
