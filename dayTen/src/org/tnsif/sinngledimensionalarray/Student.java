package org.tnsif.sinngledimensionalarray;
//program to demonstrate on array of object
public class Student {

	private int ID;
	private String Name;
	private double salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Student(int iD, String name, double salary) {
		super();
		ID = iD;
		Name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	 
}
