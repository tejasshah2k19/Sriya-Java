package threads;


//class A extends Exception implements Runnable {

public class ThreadDemo extends Thread{

	void print() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print : "+i);
		}
	}
	
	public void run() {
		print();
	}
	
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
//		t.print();
		
		Copy c = new Copy();
		Thread t1 = new Thread(c);
		t.start();//create stack in memory for t and then load run method 
		t1.start();
	
	}
}


class Copy implements Runnable{
	void copy() {
		for(int i=1;i<=10;i++) {
			System.out.println("Copy : "+i);
		}
	}
	public void run() {
		copy();
	}
}