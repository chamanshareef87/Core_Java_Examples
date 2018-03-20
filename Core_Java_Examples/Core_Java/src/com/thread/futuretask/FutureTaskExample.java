package com.thread.futuretask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskExample {

	public static void main(String[] args) {
		
		Callable callable1 = new MyCallable1(3000);
		Callable callable2 = new MyCallable1(5000);
		
		FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
		FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.submit(futureTask1);
		executor.submit(futureTask2);
		
		while(true) {
			try {
				if(futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Done");
					//Shutdown executor service
					executor.shutdown();
					return;
				}
				
				if(!futureTask1.isDone()) {
					//wait indefinitely for future task to complete
					System.out.println("Future task one output::"+futureTask1.get());
				}
				
				System.out.println("Waiting for FutureTask2 to complete");

				String s  = futureTask2.get(200L, TimeUnit.MILLISECONDS );
				
				if(s !=null){
					System.out.println("FutureTask2 output="+s);
				}
				
			} catch (Exception e) {

			}
		}
		
		
	}
}

