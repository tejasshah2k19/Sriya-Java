package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User u1 = new User(1, "one@gmail.com", "one", 1000);
		User u2 = new User(2, "two@gmail.com", "two", 2000);
		User u3 = new User(3, "three@gmail.com", "three", 3000);
		User u4 = new User(4, "four@gmail.com", "four", 4000);

		File f = new File("userdata.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(u1);
		out.writeObject(u2);
		out.close();
		System.out.println("Done...");

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		User u5 = (User) ois.readObject();// u1
		System.out.println(u5.userId);
		System.out.println(u5.email);
		System.out.println(u5.password);

		User u6 = (User) ois.readObject();// u1
		System.out.println(u6.userId);
		System.out.println(u6.email);
		System.out.println(u6.password);

		ois.close();
   
	}
}

//marker interface --zero method 
class User implements Serializable {
	int userId;
	String email;
	transient String password;// do not write in file
	float balance;

	User() {
		System.out.println("User()");
	}

	User(int userId, String email, String password, float balance) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.balance = balance;
	}
}
