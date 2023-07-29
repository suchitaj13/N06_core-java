package org.tnsif.hierarchicalinheritance;
//child class
public class Primesu extends Andriod {
	
	//private data member
	private int version;
		//getters and setters
	public int getVersion() {
	return version;
	}

public void setVersion(int version) {
		this.version = version;
	}

	//parameterized constructor
public Primesu(String brand, String slotType,int version) {
	super(brand, slotType);
	this.version=version;
}
//toString()method;
@Override
public String toString() {
	return "Primesu [version=" + version + ", toString()=" + super.toString() + "]";
}
}