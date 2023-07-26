//program to demonstrate on default and parameterized constructor 
package org.tnsf.classandobject;

public class Library
{
 public long noOfBooks;
 public String authorName;
 public String bookName;
public double price;

//default constructor
public Library() {
	super();
	// TODO Auto-generated constructor stub
}

//parameterized constructor 
public Library(long noOfBooks, String authorName, String bookName, double price) {
	super();
	this.noOfBooks = noOfBooks;
	this.authorName = authorName;
	this.bookName = bookName;
	this.price = price;
}

//to string method
@Override
public String toString() {
	return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
			+ price + "]";
}
}   
