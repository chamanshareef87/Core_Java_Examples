package com.thread;

public class ThreadExample extends Thread {
	
	public ThreadExample(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread Example STRATED:: "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();

		} catch (Exception e) {
			
		}
		System.out.println("Thread Example ENDS:: "+Thread.currentThread().getName());
	}
	
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(100);
	}
}
