package org.tnsf.singleinheritance;

public class Citizens {
	
	private String City;
	private int pincode;
	private String area;
	private long adharno;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public Citizens() {
		super();
		System.out.println("Citizen-Parent Class");
		
	}
	//parameterized constructor
	public Citizens(String city, int pincode, String area, long adharno) {
		super();
		this.City = city;
		this.pincode = pincode;
		this.area = area;
		this.adharno = adharno;
	}
	

}



