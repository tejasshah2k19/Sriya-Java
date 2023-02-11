package iodemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter(new File("mydata.txt"));

		pw.println("juhi");
		pw.println("sunFlower");

		pw.close();
		System.out.println("***************");
	}
}
