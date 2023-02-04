package iodemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("demo.txt");//
		System.out.println(f.exists());
		System.out.println(f.createNewFile());// true/false
		File f1 = new File("d:\\temp\\temp.txt");
		f1.createNewFile();
		File f2 = new File("d:\\temp\\");
		f2.createNewFile();
		System.out.println(f2.exists());// true - false
		System.out.println(f2.delete());// true - false
		System.out.println(f2.isFile()); // true ->
		System.out.println(f2.isDirectory());

		System.out.println("*****************************");

		File dir = new File("d:\\temp\\myfolder");
		dir.mkdir();

		File fdir = new File(dir, "paint.pdf");
		fdir.createNewFile();
		fdir.delete();//paint.pdf  
		dir.delete();//myFolder 
		
		System.out.println(f.length());//byte 

	}
}
