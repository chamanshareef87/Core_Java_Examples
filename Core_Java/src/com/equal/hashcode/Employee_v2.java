package com.equal.hashcode;

/*
 * Class with equals method overriden.
 * 
 */
public class Employee_v2 {

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

	@Override
	public boolean equals(Object o){
		
		if(o == null)
	    {
	        return false;
	    }
	    if (o == this)
	    {
	        return true;
	    }
	    if (getClass() != o.getClass())
	    {
	        return false;
	    }
	     
	    Employee_v2 e = (Employee_v2) o;
	    return (this.getId() == e.getId());
	    
	}
	
}
