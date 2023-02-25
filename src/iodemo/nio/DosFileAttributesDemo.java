package iodemo.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesDemo {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d:\\temp\\data.txt");
		
		DosFileAttributes d = Files.readAttributes(p, DosFileAttributes.class);
		
		System.out.println(d.isArchive());
		System.out.println(d.isDirectory());
		System.out.println(d.isHidden());
		System.out.println(d.isReadOnly());
		Files.setAttribute(p, "dos:hidden",true);
		
	}
}
