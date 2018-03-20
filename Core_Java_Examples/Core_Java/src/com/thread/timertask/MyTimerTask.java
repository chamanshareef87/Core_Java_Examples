package com.thread.timertask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * Java Timer class is thread safe and multiple threads can share a single Timer object without need for external synchronization
 */

public class MyTimerTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timer task finished at:"+new Date());
	}

	/*
	 * Notice that one thread execution will take 5 seconds but Java Timer object
	 * is scheduled to run the task every 2 seconds.
	 */
	/*
	 * The output confirms that if a task is already executing, Timer will wait for
	 * it to finish and once finished, it will start again the next task from the
	 * queue.
	 */
	/*
	 * Timer cancel() method is used to terminate the timer and discard any
	 * scheduled tasks, however it doesn’t interfere with the currently executing
	 * task and let it finish.
	 */
	
	private void completeTask() {
        try {
            //assuming it takes 5 secs to complete the task
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
	public static void main(String args[]){
        TimerTask timerTask = new MyTimerTask();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 2*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
