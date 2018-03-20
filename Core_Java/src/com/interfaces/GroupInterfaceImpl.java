package com.interfaces;

public class GroupInterfaceImpl implements GroupedInterfaceExample{

	@Override
	public void method1() {
		System.out.println("Method1 implementation from impl");
	}
	@Override
	public void method2() {
		System.out.println("Method2 implementation from impl");
	}
	@Override
	public void addArth(int i, double x) {
		System.out.println("addition of two numbers::"+(i+x));
	}
	@Override
	public int printResult(String s) {
		System.out.println("printing value::"+s);
		return 0;
	}

	@Override
	public void printConstants() {
		System.out.println("Printing constants");
		System.out.println(pi);
		System.out.println(strConstant);
		System.out.println(E);
	}

	
	public static void main(String[] args){
		GroupedInterfaceExample groupedInterfaceExample = new GroupInterfaceImpl();
		groupedInterfaceExample.method1();
		groupedInterfaceExample.method2();
		groupedInterfaceExample.addArth(2, 4);
		groupedInterfaceExample.printResult("Group Interface....");
		groupedInterfaceExample.printConstants();
	}

	
}
