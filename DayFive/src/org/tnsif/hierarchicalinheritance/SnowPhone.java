package org.tnsif.hierarchicalinheritance;

public class SnowPhone extends Andriod {
	
	//private data members
	
	private int version;
//getters and setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	//parameterized constructor
public SnowPhone(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
	}
//toString()method;
@Override
public String toString() {
	return "Primesu [version=" + version + ", toString()=" + super.toString() + "]";
}


}
