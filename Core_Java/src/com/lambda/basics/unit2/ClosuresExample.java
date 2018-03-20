package com.lambda.basics.unit2;

public class ClosuresExample {

	public static void main(String[] args){
		int a=10;
		int b=20;
		
		doProcess(a, new Process(){
			@Override
			public void process(int i) {
				System.out.println(i+b);
			}
		});
		
		//java 8
		doProcess(a, i->System.out.println(i+b));

	}
	
	public static void doProcess(int i, Process p){
		p.process(i);
	}
	
	public interface Process{
		void process(int i);
	}
}
