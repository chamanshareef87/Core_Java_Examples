package com.thread.daemon;

public class JavaDaemonThread {

	
	/*
	 * Thread.setDaemon(true) is used to create a daemon thread in java. When we
	 * execute above daemon thread program, JVM creates first user thread with
	 * main() method and then a daemon thread. When we execute above daemon thread
	 * program, JVM creates first user thread with main() method and then a daemon
	 * thread.
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(), "dt");
        dt.setDaemon(true);
        dt.start();
        //continue program
        Thread.sleep(5000);
        System.out.println("Finishing program");
    }
	
}


class DaemonThread implements Runnable{

    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("Processing daemon thread");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /*
	 * Usage 
	 * Usually we create a daemon thread for functionalities that are not
	 * critical to system. For example logging thread or monitoring thread to
	 * capture the system resource details and their state. If you are not okay will
	 * a thread being terminated, don’t create it as a daemon thread.
	 */
    
}