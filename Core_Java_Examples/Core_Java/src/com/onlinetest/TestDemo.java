package com.onlinetest;

public class TestDemo {
	
	private int count = 1;
	public synchronized void doSomething() {
		for(int i=0 ; i< 10 ; i++) {
			System.out.println(count++);
		}
	}
	
	public static void main(String args[]) {
		
		TestDemo demo = new TestDemo();
		Thread t1 = new Example(demo);
		Thread t2 = new Example(demo);
		t1.start();
		t2.start();
	}

	public static void main(int args[]) {
		int[] nos = {1,2,3};
		main(nos);
		System.out.println("hello");
	}

}

class Example extends Thread
{
	TestDemo demo;
	public Example(TestDemo td) {
		demo = td;
	}
	public void run() {
		demo.doSomething();
	}
}
