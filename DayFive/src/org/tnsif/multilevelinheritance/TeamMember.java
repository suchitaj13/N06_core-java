package org.tnsif.multilevelinheritance;
//child class2 and parent class(C)
public class TeamMember extends TeamLed {
	
	//private data members
	
	private int size;
	private int duration;
	
//getters and setters;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
//parametrized constructor
	public TeamMember(String depName, String name, int empId, String leadName, String projectName, int size, int duration) {
		super(depName, name, empId, leadName, projectName);
		this.size=size;
		this.duration=duration;
	}
//toStringmethod()
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	

}
