package com.thread.threadpool.continuesrunningthreads;

public class ThreadPoolContiTest {

	public static void main(String[] args) throws InterruptedException {
		
		WorkerThread worker = new WorkerThread("cmd-"+1); 
			Thread thread = new Thread(worker);
			thread.start();
			WorkerThread worker2 = new WorkerThread("cmd-"+2); 
			Thread thread2 = new Thread(worker2);
			thread2.start();
			
			Thread.sleep(10000);
			worker.shutdown();
			worker2.shutdown();
	
	}

}
