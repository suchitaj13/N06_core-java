package org.tsif.thiskeyworddemo;
class Director{
	String name;
	void print()
	{
		this.name="Mahesh Bhatt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("Director name is: "+name);
	}
	
}

public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d=new Director();
		d.print();

	}

}
