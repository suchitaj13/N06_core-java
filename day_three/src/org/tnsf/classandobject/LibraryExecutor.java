// Program to demonstrate on default and parameterized constructor.
package org.tnsf.classandobject;
//class declration
 
public class LibraryExecutor {

	public static void main(String[] args) {
		Library l = new Library();
		Library l1 = new Library(5,"Suchita Jadhav","Java Programming",150);
		
		System.out.println(l1);
		

	}

}