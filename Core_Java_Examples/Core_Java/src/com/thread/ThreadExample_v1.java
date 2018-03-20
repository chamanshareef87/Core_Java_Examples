package com.thread;

public class ThreadExample_v1 {

	public static void main(String[] args) {


		Thread t = new Thread(new Runnable(){
		    @Override
		    public void run() {
		    System.out.println("running thread");
		    }
		});
		
		t.start();
		
		//Java 8
		Thread t2 = new Thread(() -> {
			System.out.println("My Runnable2222");
		});
		t2.start();
		
		
	}

}
