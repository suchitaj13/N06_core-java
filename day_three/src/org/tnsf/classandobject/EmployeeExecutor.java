//driver class
//program to demonstrate on class and objects 
package org.tnsf.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId=13896;
		e.empName="Suchita Jadhav";
		e.salary=78000;
		e.department="IT";
		//method call
		e.display();

	}

}
