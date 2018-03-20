package com.thread;

public class ThreadTest {


	public static void main(String[] args){
//		Thread t1 = new Thread(new RunnableExample());
//		Thread t2 = new Thread(new RunnableExample());
		Thread t1 = new Thread(new RunnableExample(), "t1");
		Thread t2 = new Thread(new RunnableExample(), "t2");
		System.out.println("=====Starting runnable thread========");
		t1.start();
		t2.start();
		System.out.println("====runnable thread has been started====");
		
		//Note a difference in creating a thread
		Thread t3 = new ThreadExample("t3");
		Thread t4 = new ThreadExample("t4");
		System.out.println("========Starting ThreadExample========");
		t3.start();
		t4.start();
		System.out.println("===ExampleThread has been started=====");
	}

}
