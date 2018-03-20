package com.thread.waitnotify;

public class Notifier implements Runnable {

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }
    
	/*
	 * A class that will process on Message object and then invoke notify method to
	 * wake up threads waiting for Message object. Notice that synchronized block is
	 * used to own the monitor of Message object.
	 * 
	 */

    /*
     * notify() method has wake up only one of them, the other thread is still waiting to get notified. 
     */
     
    /*
     * notifyAll() method wake up both the Waiter threads and program completes and terminates after execution
     */

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMessage(name+" Notifier work done");
                System.out.println("calling Notify/notifyAll");
                msg.notify();
//                 msg.notifyAll();
                
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
