package iodemo.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		f.createNewFile();
		System.out.println(f.exists());
		f.delete();
		System.out.println(f.isFile());

		File d = new File("test");
		d.mkdir(); // location must be exists

		File d1 = new File("d:\\test\\test2\\test3");
		d1.mkdirs();// d:\\test? test? create test2 create test3

		// Path Paths Files
		Path p = Paths.get("test.txt");
		Files.createFile(p);
		System.out.println(Files.exists(p));
		Files.deleteIfExists(p);
		Files.isDirectory(p);

	}
}
