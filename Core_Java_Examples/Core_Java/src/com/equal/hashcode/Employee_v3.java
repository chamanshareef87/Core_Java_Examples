package com.equal.hashcode;

public class Employee_v3 {

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
	     
	    Employee_v3 e = (Employee_v3) o;
	    return (this.getId() == e.getId());
	}
	
	@Override
	public int hashCode(){
		final int PRIME = 31;
		int result = 1;
		result = PRIME*result+getId();
		return result;
	}
	
}
