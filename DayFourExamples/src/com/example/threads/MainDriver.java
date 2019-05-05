package com.example.threads;

public class MainDriver {

	public static void main(String[] args) throws InterruptedException {

		Thread worker = new FirstThreadExample();
		Thread developer = new Thread(new MyRunnable());
		
		worker.start();
		developer.start();
		
		//Thread lilT = Thread.currentThread();
		
		worker.sleep(6000);		
		developer.sleep(8000);
		
		//worker.run();
		// run method will not create a separate thread
		
		for(int i = 0; i<20; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		//daemon threads - never stop running in the background
		
	}

}
