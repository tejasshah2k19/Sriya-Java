package iodemo.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Nio2 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("d:\\temp\\data.txt");
		Path p2 = Paths.get("d:\\temp\\databackup.txt");

		Files.copy(p1, p2);
		Files.move(p1, p2);

		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
	}
}
