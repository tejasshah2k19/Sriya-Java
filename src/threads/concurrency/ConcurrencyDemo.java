package threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadDemo extends Thread {
	public void run() {
		System.out.println("this is run method...");
	}
}

public class ConcurrencyDemo {

	public static void main(String[] args) {
		// 4

//		ExecutorService ex = Executors.newSingleThreadExecutor();//
		// 1 by 1
		// pushing all the treads in memory --> 100
		// 100 -> queue
		// ExecutorService ex = Executors.newFixedThreadPool(5);//

		ExecutorService ex = Executors.newCachedThreadPool();// 2 3          
		ThreadDemo t1 = new ThreadDemo();
		// 100
		ex.submit(t1);//

		ex.shutdown();
	}
}
