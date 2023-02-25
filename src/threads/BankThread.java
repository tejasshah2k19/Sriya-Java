package threads;

public class BankThread extends Thread {

	int balance = 10000;

	synchronized void wid(int amt) {
		System.out.println(currentThread().getName() + "is Wid...start..");
		if (balance - amt >= 0) {
			balance = balance - amt;
		} else {
			System.out.println(currentThread().getName() + " => balance low..." + balance);
		}
		System.out.println(currentThread().getName() + " wid finish...");
	}

	public void run() {
		wid(5000);
	}

	public static void main(String[] args) {

		BankThread c = new BankThread();

		Thread t1 = new Thread(c);
		t1.setName("ram");
		Thread t2 = new Thread(c);
		t2.setName("ravan");
		Thread t3 = new Thread(c);
		t3.setName("sita");

		t1.start();
		t2.start();
		t3.start();

	}

}
