package com.lambda.basic.uint1;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread mythread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside runnalbe");
			}
		});
		
		mythread.start();
	
		//using lambda
		Thread mylambdaThread = new Thread(()->System.out.println("Printed inside lambda runnable interface"));
		mylambdaThread.start();
	}

}
