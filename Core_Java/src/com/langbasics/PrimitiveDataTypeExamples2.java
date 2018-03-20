package com.langbasics;

public class PrimitiveDataTypeExamples2 {

	byte	bytevariable;
	short	shortVariable;
	int	intVariable;
	long longVariable;
	float	floatVariable;
	double	doubleVariabled;
	char	charVariable;
	boolean	booleanVariable;
	String stringVariable;


	//At calss level all primitives will be initialised with default values
	public static void main(String[] args) {

		System.out.println(new PrimitiveDataTypeExamples2().toString());
		System.out.println(new PrimitiveDataTypeExamples2().isBooleanVariable());
		System.out.println(new PrimitiveDataTypeExamples2().getStringVariable());
		
	}
	
	@Override
	public String toString() {
		return "PrimitiveDataTypeExamples2 [bytevariable=" + bytevariable + ", shortVariable=" + shortVariable
				+ ", intVariable=" + intVariable + ", longVariable=" + longVariable + ", floatVariable=" + floatVariable
				+ ", doubleVariabled=" + doubleVariabled + ", charVariable=" + charVariable + ", booleanVariable="
				+ booleanVariable + ", stringVariable=" + stringVariable + "]";
	}

	public byte getBytevariable() {
		return bytevariable;
	}

	public void setBytevariable(byte bytevariable) {
		this.bytevariable = bytevariable;
	}

	public short getShortVariable() {
		return shortVariable;
	}

	public void setShortVariable(short shortVariable) {
		this.shortVariable = shortVariable;
	}

	public int getIntVariable() {
		return intVariable;
	}

	public void setIntVariable(int intVariable) {
		this.intVariable = intVariable;
	}

	public long getLongVariable() {
		return longVariable;
	}

	public void setLongVariable(long longVariable) {
		this.longVariable = longVariable;
	}

	public float getFloatVariable() {
		return floatVariable;
	}

	public void setFloatVariable(float floatVariable) {
		this.floatVariable = floatVariable;
	}

	public double getDoubleVariabled() {
		return doubleVariabled;
	}

	public void setDoubleVariabled(double doubleVariabled) {
		this.doubleVariabled = doubleVariabled;
	}

	public char getCharVariable() {
		return charVariable;
	}

	public void setCharVariable(char charVariable) {
		this.charVariable = charVariable;
	}

	public boolean isBooleanVariable() {
		return booleanVariable;
	}

	public void setBooleanVariable(boolean booleanVariable) {
		this.booleanVariable = booleanVariable;
	}

	public String getStringVariable() {
		return stringVariable;
	}

	public void setStringVariable(String stringVariable) {
		this.stringVariable = stringVariable;
	}

	
}

