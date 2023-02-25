package threads;

public class ThreadMethod {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		
		a.start();
		a.join();
		b.start();
	}
}

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("A :: " + i);
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("B :: " + i);
		}
	}
}
