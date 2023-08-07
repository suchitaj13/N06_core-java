package org.tnsif.superkeyword;
//program to demonstrate on super keyword with variable
class Building
{
	int floors=23;
	String name="Anantha-Astha";
	}
class Flat extends Building{
	String name="Suchita Jadhav";
	
	void print()
	{
		/*if parent class and child class variable name are same
		 * and if you want to access parent class variable inside
		 * child class use super.variblename
		 */ 
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class SuperKeywordWithVarible {

	public static void main(String[] args) {
		Flat f=new Flat();
		f.print();
		
	}

}
