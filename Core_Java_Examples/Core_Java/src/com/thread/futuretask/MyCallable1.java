package com.thread.futuretask;

import java.util.concurrent.Callable;

public class MyCallable1 implements Callable<String> {

	private long waitTime;
	
	public MyCallable1(int milisec) {
		this.waitTime=milisec;
	}
	
	@Override
	public String call() throws Exception {

		Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
        
	}

}
