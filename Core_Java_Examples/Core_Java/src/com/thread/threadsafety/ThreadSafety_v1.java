package com.thread.threadsafety;

public class ThreadSafety_v1 {

	public static void main(String[] args) throws InterruptedException {
		ProcessingThread_v1 pt = new ProcessingThread_v1();
		Thread t1 = new Thread(pt, "t1");
		t1.start();
		Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
	}

}

class ProcessingThread_v1 implements Runnable{

	private int count;
	//dummy object variable for synchronization
    private Object mutex=new Object();
	
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
//			count++;
		    //using synchronized block to read, increment and update count value synchronously
		    synchronized (mutex) {
		            count++;
		    }
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

