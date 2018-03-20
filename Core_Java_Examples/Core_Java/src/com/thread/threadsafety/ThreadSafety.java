package com.thread.threadsafety;

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {
		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt, "t1");
		t1.start();
		Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
	}

	/*
	 * In above program for loop, count is incremented by 1 four times and since we
	 * have two threads, it's value should be 8 after both the threads finished
	 * executing. But when you will run above program multiple times, you will
	 * notice that count value is varying between 6,7,8. This is happening because
	 * even if count++ seems to be an atomic operation, its NOT and causing data
	 * corruption.
	 */
	
}

class ProcessingThread implements Runnable{

	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			processSomething(i);
			count++;
		}
	}


	private void processSomething(int i) {
		//processing some job
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

