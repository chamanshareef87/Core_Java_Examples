package com.thread.timertask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Java Timer class is thread safe and multiple threads can share a single Timer object without need for external synchronization
 */

public class MyTimerTask_Schedule extends TimerTask {

	@Override
	public void run() {
		System.out.println("Thread::"+Thread.currentThread().getName()+"Timer task started at:"+new Date());
	}

	public static void main(String args[]){
		System.out.println("Main starting");
        TimerTask timerTask = new MyTimerTask_Schedule();
        Timer timer = new Timer();
        
        timer.schedule(timerTask, 1000);
//        timer.schedule(timerTask, 1000, 3000);

	}

}
