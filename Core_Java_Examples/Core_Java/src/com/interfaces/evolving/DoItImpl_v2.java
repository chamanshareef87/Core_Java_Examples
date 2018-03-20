package com.interfaces.evolving;

public class DoItImpl_v2 implements DoIt_v2{

	/*
	 * (non-Javadoc)
	 * Note we are not implementing default method 
	 * didItWork in implementation class
	 */
	
	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * This is an optional 
	 * uncomment and see what happnes
	 * Implementing default method is purly optional
	 * but still you can override and give custom implementation
	 */
	
//	@Override
//	public String didItWork(int i, double x, String s) {
//		System.out.println("from impl");
//		 return "Am from impl";
//	 }

	public static void main(String[] args){
		DoIt_v2 doIt_v2 = new DoItImpl_v2();
		System.out.println(doIt_v2.didItWork(0, 0, null));
	}
	
}
