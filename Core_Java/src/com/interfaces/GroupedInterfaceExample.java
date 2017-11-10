package com.interfaces;

public interface GroupedInterfaceExample extends 
	InterfaceExample1, 
	InterfaceExample2 {
	
	// constant declarations
    // base of natural logarithms
    double E = 2.718282;
 
    // method signatures
    void addArth (int i, double x);
    int printResult(String s);
    void printConstants();
}
