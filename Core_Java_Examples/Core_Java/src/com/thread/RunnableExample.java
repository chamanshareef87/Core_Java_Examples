package com.thread;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Running runnble thread:: startes:: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Running runnble thread:: ENDS::" + Thread.currentThread().getName());
		
	}

	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(100);
	}

}
