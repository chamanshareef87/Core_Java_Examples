package com.clonable;

import java.util.Map;

public class Employee_c implements Cloneable {

	private int id;
	private String name;
	private Map<String, String> props;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	
	//Returns the copy of object by calling super.clone.
	 @Override
	 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
	 }

	@Override
	public String toString() {
		return "Employee_c [id=" + id + ", name=" + name + ", props=" + props + "]";
	}
	 
	 
}
