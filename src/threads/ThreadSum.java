package threads;

public class ThreadSum extends Thread {

	int sum = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadSum t = new ThreadSum();
		t.start();//t -> 10 instruction 
//		t.join();
//		Thread.sleep(2);
	
		System.out.println("Sum => " + t.sum);//
	}// 1+2+3----10 -> 55
}
