package com.lambda.basics.unit2;

import com.lambda.basics.unit2.ClosuresExample.Process;

public class ThisReferenceExample {

	public void doProcess(int i, Process p){
		p.process(i);
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		thisReferenceExample.doProcess(10, new Process(){
			@Override
			public void process(int i) {
				System.out.println("Value of i is:"+i);
				//this here refers to anonymous inner class
				System.out.println(this);
			}
			public String toString(){
				return "This is anonymous inner class";
			}
		});
		
		thisReferenceExample.doProcess(10, i->{
			System.out.println("Value of i is::"+i);
			//System.out.println(this); this will not work
		});
		
		thisReferenceExample.execute();
	}

	public void execute(){
		doProcess(10, i->{
			System.out.println("Value of i is::"+i);
			System.out.println(this);
		});
	}

	public String toString(){
		return "This is the main ThisReferenceExample class instance";
	}

}
