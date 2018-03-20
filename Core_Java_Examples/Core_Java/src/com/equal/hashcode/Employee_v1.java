package com.equal.hashcode;

/*
 * Class without equals and hashcode over riding, 
 * this will have default implementations of 
 * equale and hashcode methods.
 * 
 */
public class Employee_v1 {

	private Integer id;
    private String firstname;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
