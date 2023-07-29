package org.tnsif.multilevelinheritance;
//child class1 and parent class(B)
public class TeamLed extends Manager {
	
	//private data members
	private String leadName;
	private String projectName;
	
	//getters and setters
	public String getLeadName(){
		return leadName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	} 
	//parametrized constructor
	public TeamLed(String depName, String name, int empId, String leadName, String projectName) {
		super(depName, name, empId);
		this.leadName=leadName;
		this.projectName=projectName;
		
	}
	//toString() method;
	@Override
	public String toString() {
		return "TeamLed [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}

}
