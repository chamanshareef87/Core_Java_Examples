package com.thread.deadlock;

public class ThreadDeadlock_v1 {

	/*
	 * Avoid Nested Locks: This is the most common reason for deadlocks, avoid
	 * locking another resource if you already hold one. It’s almost impossible to
	 * get deadlock situation if you are working with only one object lock. For
	 * example, here is the another implementation of run() method without nested
	 * lock and program runs successfully without deadlock situation.
	 */
	
	public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
    
        Thread t1 = new Thread(new SyncThread_v1(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread_v1(obj2, obj3), "t2");
        Thread t3 = new Thread(new SyncThread_v1(obj3, obj1), "t3");
        
        t1.start();
        Thread.sleep(500);
        t2.start();
        Thread.sleep(500);
        t3.start();
        
    }
}

class SyncThread_v1 implements Runnable{
    private Object obj1;
    private Object obj2;

    public SyncThread_v1(Object o1, Object o2){
        this.obj1=o1;
        this.obj2=o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquiring lock on " + obj1);
        synchronized (obj1) {
            System.out.println(name + " acquired lock on " + obj1);
            work();
        }
        System.out.println(name + " released lock on " + obj1);
        System.out.println(name + " acquiring lock on " + obj2);
        synchronized (obj2) {
            System.out.println(name + " acquired lock on " + obj2);
            work();
        }
        System.out.println(name + " released lock on " + obj2);

        System.out.println(name + " finished execution.");
    }
    
    private void work() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
