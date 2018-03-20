package com.classes.nestedclasses.anonymous;

public class HelloWorldAnonymousClasses {
	
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello(){
		
		/*
		 * anonymous classes are expressions, which means that you define the class in another expression
		 */
		
		//Anonymous class 
		class EnglishGreeting implements HelloWorld{
			String name="World";
			@Override
			public void greet() {
				greetSomeone("world");
			}
			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello "+name);
			}
		}
		
		HelloWorld englishGreeting = new EnglishGreeting();

		//Anonymous class 
		HelloWorld frenchGreeting = new HelloWorld(){
			String name = "tout le monde";
			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}
			@Override
			public void greetSomeone(String someone) {
				name = someone;
                System.out.println("Salut " + name);
			}
		};

		//Anonymous class 
		 HelloWorld spanishGreeting = new HelloWorld() {
	            String name = "mundo";
	            public void greet() {
	                greetSomeone("mundo");
	            }
	            public void greetSomeone(String someone) {
	                name = someone;
	                System.out.println("Hola, " + name);
	            }
	     };
	     
	     englishGreeting.greet();
	     frenchGreeting.greetSomeone("Fred");
	     spanishGreeting.greet();   
		
	}
	
	public static void main(String[] args){
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
	        myApp.sayHello();
	}
	
}
