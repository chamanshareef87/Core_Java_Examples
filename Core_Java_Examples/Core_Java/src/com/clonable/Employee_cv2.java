package com.clonable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Clone the objects using a copy constructor
 */

public class Employee_cv2 {

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

	
	public Employee_cv2(Employee_cv2 emp) {
		
		this.setId(emp.getId());
		this.setName(emp.getName());
		
		Map<String, String> hm = new HashMap<>();
		String key;
		Iterator<String> it = emp.getProps().keySet().iterator();
		// Deep Copy of field by field
		while (it.hasNext()) {
			key = it.next();
			hm.put(key, emp.getProps().get(key));
		}
		this.setProps(hm);
	}
	

	public Employee_cv2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee_cv2 [id=" + id + ", name=" + name + ", props=" + props + "]";
	}
	 
	 
}
