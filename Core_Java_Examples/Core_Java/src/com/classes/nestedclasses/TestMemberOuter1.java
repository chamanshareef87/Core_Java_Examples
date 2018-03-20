package com.classes.nestedclasses;

/*
 * A not static nested class(inner class) can access the 
 * members of its enclosing class.
 *  
 */
public class TestMemberOuter1 {

	private int data=30;
	
	//Inner class defiened
	class InnerExample{
		void message(){
			System.out.println("Data is::"+data);
		}
	}
	
	
	public static void main(String[] args) {
		TestMemberOuter1 outer = new TestMemberOuter1();
		//Note how inner class object is created and method is accessesd
		TestMemberOuter1.InnerExample inner = outer.new InnerExample();
		inner.message();
	}

}
