package org.tnsif.hierarchicalinheritance;
//base class
public class Andriod {
	//private data members
	private String brand;
	private String SlotType;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlotType() {
		return SlotType;
	}
	public void setSlotType(String slotType) {
		SlotType = slotType;
	}
	//parametrized construtor
	public Andriod(String brand, String slotType) {
		super();
		this.brand = brand;
		this.SlotType = slotType;
	}
	
	
	

}
