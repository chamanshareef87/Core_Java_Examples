package com.thread.waitnotify;

public class WaitNotifyTest {

	
	/*
	 * notify method wakes up only one thread waiting on the object and that thread
	 * starts execution. So if there are multiple threads waiting for an object,
	 * this method will wake up only one of them. The choice of the thread to wake
	 * depends on the OS implementation of thread management.
	 */
	
	/*
	 * notifyAll method wakes up all the threads waiting on the object, although
	 * which one will process first depends on the OS implementation.
	 */
	
	public static void main(String[] args) {

		Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
        
	}

}
