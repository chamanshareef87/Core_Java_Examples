package com.lambda.basic.uint1;

public class GreeterExample {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String[] args){

		//Normal using iterface calling perform
		GreeterExample greeter = new GreeterExample();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);

		//uisng inner class
		Greeting innerClassGreeting = new Greeting() {
			public void perform(){
				System.out.println("Hello world");
			}
		};
		greeter.greet(innerClassGreeting);
		
		//Using lambda exp we are printing 
		Greeting myLambdaFunction = ()->System.out.println("Hello world");
		greeter.greet(myLambdaFunction);

	}
	
}
