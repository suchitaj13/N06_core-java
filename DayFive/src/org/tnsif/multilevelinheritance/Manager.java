package org.tnsif.multilevelinheritance;
//parent class(A)
public class Manager {
//private data members
	private String depName;
	private String Name;
	private int empId;
	
	//getters and setters;
	public String getDepName() {
		return depName;
	}
	
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
//	toString()method;
	@Override
	public String toString() {
		return "Manager [depName=" + depName + ", Name=" + Name + ", empId=" + empId + ", getDepName()=" + getDepName()
				+ ", getName()=" + getName() + ", getEmpId()=" + getEmpId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	//Parametrized Constructor
	public Manager(String depName, String name, int empId) {
	super();
	this.depName = depName;
	this.Name = name;
	this.empId = empId;
}
	
	
}
