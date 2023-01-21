package exceptiond;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException,FileAlreadyExistsException{

			File f = new File("dd.txt");
			f.createNewFile();// IOException
	}
	
	void add() throws Exception {
		
	}
}
