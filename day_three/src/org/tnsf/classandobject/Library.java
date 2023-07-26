 // Program to demonstrate on default and parameterized constructor 

package org.tnsf.classandobject;

public class Library {
	
	// Public data members
	
	public long NoOfBook;
	public String authorName;
	public String bookName;
	public double price;
	
	// Default Constructor
	public Library() {
		System.out.println("Default Constructor");
	}
	
	
	// Parameterized Constructor
	public Library(long noOfBook, String authorName, String bookName, double price) {
		super();
		NoOfBook = noOfBook;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}


	@Override
	public String toString() {
		return "Library [NoOfBook=" + NoOfBook + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}