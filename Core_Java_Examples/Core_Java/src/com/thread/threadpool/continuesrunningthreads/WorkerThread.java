package com.thread.threadpool.continuesrunningthreads;

public class WorkerThread implements Runnable {

	private String command;
	private boolean run = true;
	
	public WorkerThread(String s) {
		this.command = s;
	}
	
	@Override
	public void run() {
        while(run) {
    		try {
            	System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
    			Thread.sleep(3000);
    			System.out.println(Thread.currentThread().getName()+" End. Command = "+command);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
        }
	}

	public void shutdown() {
		this.run= false;
		System.out.println("shutting down "+Thread.currentThread().getName());
	}
	
}
