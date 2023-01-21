
public class InitBlock {

	static {
		System.out.println("STATIC from InitBlock");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main()");
		Laptop l = new Laptop();
		Laptop t = new Laptop();
//		Class.forName("Laptop");
	}
}

class Laptop {
	public Laptop() {
		System.out.println("Laptop()");
	}

	// static block
	static {
		System.out.println("Static block Laptop...");
	}

	// instance init block
	{
		System.out.println("instance block  1 ");
	}

	{
		System.out.println("instance block 2 ");
	}
}
